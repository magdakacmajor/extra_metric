class StandardEnvironmentTests {
  @Test
  void acceptsProfiles_withProfileExpression() {
    assertThat(environment.acceptsProfiles("pd")).isFalse();
    environment.addenvironmentProfile("p1");
    assertThat(environment.acceptsProfiles("pd")).isTrue();
    environment.setActiveProfiles("p1");
    assertThat(environment.acceptsProfiles("pd")).isFalse();
    assertThat(environment.acceptsProfiles("p1")).isTrue();
  }
}
