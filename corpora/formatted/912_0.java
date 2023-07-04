class CandidateComponentsIndexLoaderTests {
  @Test
  public void loadIndexNoMatch() {
    CandidateComponentsIndex index =
        CandidateComponentsIndexLoader.loadIndex(
            CandidateComponentsTestClassLoader.index(
                getClass().getClassLoader(),
                new ClassPathResource("spring.components", getClass())));
    Set<String> components = index.getCandidateTypes("com.example", "foo");
    assertThat(components).isEmpty();
  }
}
