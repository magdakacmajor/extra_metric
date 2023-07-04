class PathMatchingResourcePatternResolverTests {
  @Test
  void classpathStarWithPatternInJar() throws IOException {
    Resource[] resources = resolver.getResources("classpath:reactor/util/annotation/*.class");
    assertProtocolAndFilenames(resources, "jar", CLASSES_IN_REACTOR_UTIL_ANNOTATIONS);
  }
}
