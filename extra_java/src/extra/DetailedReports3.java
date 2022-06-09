package extra;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.analysis.IMethodCoverage;
import org.jacoco.core.tools.ExecFileLoader;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.google.gson.Gson;

public final class DetailedReports3{
	
	enum CounterOption {
		LINE, 
		METHOD
	}

	private String  logDir;

	public DetailedReports3 (String logDir) throws IOException {
		this.logDir = logDir;
		Files.createDirectories(Paths.get(logDir));
	}
	
	public static String readInputStream(InputStream in) throws IOException{
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = in.read(buffer)) != -1) {
		    result.write(buffer, 0, length);
		}
		return result.toString(StandardCharsets.UTF_8.name());
	}
	
	public CustomCoverageBuilder extract(String execPath, String classesPath) throws IOException {
		return  extract(execPath, classesPath, null);
	}
	
	public CustomCoverageBuilder extract(String execPath, String classesPath, ArrayList<String> allowedFiles) throws IOException {		
		ExecFileLoader execFileLoader = new ExecFileLoader();
		execFileLoader.load(new File(execPath));

		final CustomCoverageBuilder coverageBuilder = (allowedFiles == null? new CustomCoverageBuilder() : new  CustomCoverageBuilder(allowedFiles));
		final Analyzer analyzer = new Analyzer(execFileLoader.getExecutionDataStore(), coverageBuilder);
		try {
			analyzer.analyzeAll(new File(classesPath));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(execPath);
			System.out.println(classesPath);
		}
		
		return coverageBuilder;
	}
	
	public void logTraces(CustomCoverageBuilder coverage) throws IOException {
		String[] exclusionPatterns = new String[0];
		logTraces(coverage, exclusionPatterns);
	}
	
	public int logTraces(CustomCoverageBuilder coverage, String[] exclusionPatterns) throws IOException {
		int excluded=0;
	
		for (final IClassCoverage cc : coverage.getClasses()) {
			int version=0;
			if(cc.getClassCounter().getCoveredCount()== 0){
				continue;
			}
			
			String fname = cc.getName().replace('/', '.').replace('$', '_');
			if (containsExclusionPattern(fname, exclusionPatterns)){
				excluded +=1;
				continue;
			}
			
			Path cutLog = (Paths.get(String.format("%s/%s.csv", logDir, fname)));
			if (Files.exists(cutLog)) {
				cutLog = (Paths.get(String.format("%s/%s_%d.csv", logDir, fname, version)));
				version ++;
			}
			Files.write(cutLog, ("cut,method,desc,line,status\n").getBytes(), StandardOpenOption.CREATE_NEW);
		
			for(IMethodCoverage method : cc.getMethods()){
				if (method.getMethodCounter().getCoveredCount()  > 0) {
					for (int i = method.getFirstLine(); i <=method.getLastLine(); i++) {
						Files.write(cutLog, 
									(cc.getName()+"," + method.getName()+"," + method.getDesc()+","+ i+"," + cc.getLine(i).getStatus() + "\n")
									.getBytes(), 
									StandardOpenOption.APPEND);
					}
				}
			}
		}
		return excluded;
	}
	
	public boolean containsExclusionPattern(String fname, String[] exclusionPatterns){
		for (String ep : exclusionPatterns){
			if (fname.contains(ep)){
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<String> parseImports(String rawImports){
		ArrayList<String> parsedImports = new ArrayList<String>();
		String[] impStatements = rawImports.trim().split(";");
		for (String stmt : impStatements) {
			String[] tokens = stmt.trim().split(" ");
			String imp = tokens[tokens.length -1];
			String[] path=imp.split("\\.");
			if (tokens.length ==3) {
				String[] newPath = new String[path.length -1];
				for (int i=0; i < newPath.length; i++) {
					newPath[i]=path[i];
				}
				path = newPath;
			}
			parsedImports.add(String.join("/", path));	
		}
		return parsedImports;
	}
	
	private static Map<String, String> getExecPaths(String execDir) {
		
		Map<String,String> files = new HashMap<String,String>();
		try (DirectoryStream<Path> stream  = Files.newDirectoryStream(Paths.get(execDir),"*.exec")) {
			for(Path entry : stream) {
				files.put(entry.toString(), entry.getFileName().toString()) ;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (files.size() != 1) {
			System.out.println("Number of exec files found in " + execDir + ": " + files.size());
		}
		return files;
	}
	
	public static void main(String[] args) throws Exception{
		
		Properties props = new Properties();
		String propsFile = args.length > 0 ? args[0] : "config/report.properties"; 
		String rootPath = System.getProperty("user.dir");
		props.load(new FileInputStream(String.join("/", rootPath, propsFile)));

		for (Object k : props.keySet()) {
			System.out.println(k + ": " + props.getProperty(k.toString()));
		}
		
		String workingDir = props.getProperty("workingDir");
		String outDir = props.getProperty("outDir");
		String projectPath = props.getProperty("projectPath");
		String profile = props.getProperty("profile");
		Boolean hasSubprojects = Boolean.valueOf(props.getProperty("hasSubprojects"));
		Boolean replaceMethod = Boolean.valueOf(props.getProperty("replaceMethod"));
		String[] exclusionPatterns = props.getProperty("exclusionPatterns").split(",");
		String[] modules = props.getProperty("modules").split(",");
		String jarClassesPath = props.getProperty("jarClassesPath");
		
		try {
			Files.createDirectory(Paths.get(workingDir, outDir));
		}catch(FileAlreadyExistsException e) {
			System.out.println("Output dir already exists");
		}
		Path[] dirs = new Path[2];
		for (int i=0; i<dirs.length; i ++){
			dirs[i] = Paths.get(workingDir, outDir, "logs" + i);
		}
		
		for (Path directory : dirs) {
			
			System.out.println(directory.toString());
			
			String input = new String(Files.readAllBytes(Paths.get(workingDir, props.getProperty("mappingFile"))));
			Gson gson = new Gson();
			ProjectMappping[] projectMappings = gson.fromJson(input, ProjectMappping[].class);
			
			ArrayList<String> skipped = new ArrayList<String>();
			ArrayList<Integer> failed = new ArrayList<Integer>();
			ArrayList<Integer> missing = new ArrayList<Integer>();
			int excluded=0;

			for (int i=0; i< projectMappings.length; i++){
				ProjectMappping pm = projectMappings[i];
				
				if (!pm.isExecutable()) {
					continue;
				}
				if (pm.getFilepath().contains(props.getProperty("subprojectToSkip")) ) {
					System.out.println("skipping:" + pm.getFilepath());
					skipped.add(pm.getFilepath());
					continue;
				}
				
				String path = String.join("/", projectPath,(hasSubprojects? pm.getParent_project() : "") );
				String logDir = String.join("/", directory.toString() , pm.getTestcase_fullname());

				String execDir = "", classesDir = "", cmd = "";
				Map<String,String> execFilePaths = new HashMap<String, String>();
				
				if (Files.exists(Paths.get(String.join("/", projectPath, "build.gradle")))) {
					execDir = String.join("/", path,  "build/jacoco");
					classesDir = "build/classes";
					cmd = hasSubprojects? String.format("./gradlew :%s:test --tests %s", pm.getParent_project(), pm.getTestcase_fullname())
										: String.format("./gradlew test --tests %s", pm.getTestcase_fullname());
				}
				
				else if (Files.exists(Paths.get(projectPath + "pom.xml"))){
					execDir = String.join ("/", path, "target/jacoco.exec");
					classesDir = "target/classes";
					cmd = String.format("mvn test -DfailIfNoTests=false -Dtest=%s -am%s", pm.getTestcase_fullname(), (profile.isEmpty()? "" : " -P" + profile) );
				}
					
				System.out.println(cmd);
				String fname = i+""; int attempts=0;	//START AND END 0
/*START 1	
				Path classFile = Paths.get(pm.getFilepath().replace("/klonhome", "/ExtraSpace/nowy/centos_home/backups/klontos_bak/home"));
				String methodName = pm.getMethodName();
				String ancestorName = pm.getAncestorClassName() == null? pm.getClassName() : pm.getAncestorClassName();
				CompilationUnit cu = JavaParser.parse(classFile);
				Predicate<MethodDeclaration> match = m -> 
													(m.getDeclarationAsString(false, false).equals(String.format("void %s()",methodName))
															&& (m.getAnnotationByName("Test").isPresent())
															&& (m.getAncestorOfType(ClassOrInterfaceDeclaration.class).get().getNameAsString().equals(ancestorName) ) );
				List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class, match);
				
				if (methods.size() != 1) {
					throw new Exception("Disaster");
				}			
				
				MethodDeclaration method=methods.get(0);
				File f = new File(substitutionDir);
				final int nameId = i;
				String[] fnames = f.list(new FilenameFilter() {	
									@Override
									public boolean accept(File f, String name) {
										return name.startsWith(String.format("%d_", nameId ) );
									}
								});
				if (fnames.length == 0) {
					missing.add(i);
					System.out.println("missing: " + i);
					continue;
				}
END1*/			failed.add(i);
				
/*START2		if (fnames.length > 1) {
					List<String> tmp = new ArrayList<String>();
					Collections.addAll(tmp, fnames);
					Collections.sort(tmp);
					tmp.add(tmp.get(0));
					fnames = tmp.toArray(new String[0]);
					assert fnames[0].equals(fnames[fnames.length -1]);
				}
				
				int attempts = fnames.length;
				
				for (String fname : fnames) {
					String origClassFileBackup=null;
END2*/			try {
/*START3						
						File origClassFile = classFile.toFile();
						origClassFileBackup = String.format("%s_orig", classFile.toString()); 
			
						List<String> allLines = SubstituteMethods.substituteBody(classFile, Paths.get(String.format("%s/%s", substitutionDir, fname)), method, standardLength) ;
						
						origClassFile.renameTo(new File(origClassFileBackup));
						Files.write(classFile, allLines);
END3*/								
						Process proc = Runtime.getRuntime().exec(cmd, null, new File(projectPath));
						proc.waitFor();
						execFilePaths = getExecPaths(execDir);

						if(proc.exitValue() > 0) {
							String s= readInputStream(proc.getErrorStream());
//							if(s.contains("file://")) {
//								String link =s.substring(s.indexOf("file://"), s.indexOf("index.html")+10);
//								Runtime.getRuntime().exec("/usr/bin/firefox " + link);
//							}
							System.out.println("Failed to build: " + fname);
//							System.out.println(s);
							attempts --;
						}
						else {
							System.out.println("Built successfully: " + fname);
							failed.remove(failed.size()-1);
							attempts=0;
						}	
						
						if (attempts==0) {
							for (String execPath : execFilePaths.keySet()) {
								DetailedReports3 reportsDep = new DetailedReports3(String.join("/", logDir, "deps")); 

								String[] notSupported = {"com.gradle"};
								File parentDir = new File(jarClassesPath);
								String[] depDirs = parentDir.list(new FilenameFilter() {	
													@Override
													public boolean accept(File ff, String name) {
														return !reportsDep.containsExclusionPattern(name, notSupported);
													}
												});
								ArrayList<String> imports = reportsDep.parseImports(pm.getClassImports());
								for (String depDir: depDirs) {
									String depClassesPath = String.join("/", jarClassesPath, depDir);
									CustomCoverageBuilder jcb = reportsDep.extract(execPath, depClassesPath); //, imports);
									excluded += reportsDep.logTraces(jcb, exclusionPatterns);									
								}						
								
								DetailedReports3 reports = new DetailedReports3( String.join("/", logDir, execFilePaths.get(execPath)));
								for (String module : modules) {
									String classesPath = String.join("/", projectPath , module , classesDir);
									CustomCoverageBuilder cb = reports.extract(execPath, classesPath);
									excluded += reports.logTraces(cb, exclusionPatterns);
								}
							}
/*START4					break;
END4 */				}				
					}catch (Exception e) {
						e.printStackTrace();
						System.out.println(pm.getFilepath());
						System.out.println(execFilePaths);
						System.out.println(cmd);
							
					}finally {
						for (String ep : execFilePaths.keySet()) {
							Files.deleteIfExists(Paths.get(ep));
						}
/*START5			Files.delete(classFile);
						new File(origClassFileBackup).renameTo(classFile.toFile());
					}
END5*/		}
			}
			System.out.println("Skipped:");
			for (String s : skipped) {
				System.out.println(s);
			}
			System.out.println("Failed");
			for (int j : failed) {
				System.out.println(j);
			}
			System.out.println("Excluded: " + excluded);
		}
	}
}