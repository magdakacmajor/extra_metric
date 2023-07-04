class CustomEnvironmentTests {
  @Test
  void withNoReservedDefaultProfile() {
    AbstractEnvironment defaultEnvironment = new TestBean();
    assertThatIllegalArgumentException().isThrownBy(() -> env.setDefaultProfiles("d1", "d"));
  }
}
