class CandidateComponentsIndexLoaderTests {
  @Test
  public void loadIndexWithException() throws IOException {
    CandidateComponentsIndex index =
        CandidateComponentsIndexLoader.loadIndex(
            CandidateComponentsTestClassLoader.index(
                getClass().getClassLoader(),
                new ClassPathResource("spring.components", getClass())));
    Set<String> components = index.getCandidateTypes("org.springframework", "foo");
    assertThat(components).contains("org.springframework.context.index.Sample3");
  }
}
