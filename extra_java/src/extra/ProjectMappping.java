package extra;

public class ProjectMappping {
	
	String filepath;
	String methodName;
	String ancestorClassName;
	String className;
	String parent_project;
	String testcase_fullname;
	String classImports;
	boolean executable;
	boolean containsStrings;
	String[] containedStrings;
	
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getAncestorClassName() {
		return ancestorClassName;
	}
	public void setAncestorClassName(String ancestorClassName) {
		this.ancestorClassName = ancestorClassName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getParent_project() {
		return parent_project;
	}
	public void setParent_project(String parent_project) {
		this.parent_project = parent_project;
	}
	public String getTestcase_fullname() {
		return testcase_fullname;
	}
	public void setTestcase_fullname(String testcase_fullname) {
		this.testcase_fullname = testcase_fullname;
	}
	public String getClassImports() {
		return classImports;
	}
	public void setClassImports(String classImports) {
		this.classImports = classImports;
	}
	public boolean isExecutable() {
		return executable;
	}
	public void setExecutable(boolean executable) {
		this.executable = executable;
	}
	public boolean isContainsStrings() {
		return containsStrings;
	}
	public void setContainsStrings(boolean containsStrings) {
		this.containsStrings = containsStrings;
	}
	public String[] getContainedStrings() {
		return containedStrings;
	}
	public void setContainedStrings(String[] containedStrings) {
		this.containedStrings = containedStrings;
	}
}
