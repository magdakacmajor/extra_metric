class CandidateComponentsIndexLoaderTests {
  @Test
  public void validateIndexIsDisabledByDefault() {
    CandidateComponentsIndex index =
        new CandidateComponentsIndex(
            CandidateComponentsTestClassLoader.index(
                getClass().getClassLoader(),
                new ClassPathResource("spring.components", getClass())));
    Set<String> components = index.getCandidateTypes("com.example", "someexample_com");
    assertThat(components).isNotNull();
    assertThat(index.isEmpty()).isFalse();
  }
}
