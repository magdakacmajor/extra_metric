class StandardEnvironmentTests {
  @Test
  void acceptsProfiles_withEmptyArgument() {
    assertThatIllegalArgumentException().isThrownBy(environment::acceptsProfiles);
  }
}
