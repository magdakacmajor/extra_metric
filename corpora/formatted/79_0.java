class PrincipalMethodArgumentResolverTests {
  @Test
  public void supportsParameter() {
    assertThat(this.resolver.supportsParameter(this.testMethod.arg(Principal.class))).isTrue();
    assertThat(
            this.resolver.supportsParameter(this.testMethod.arg(Optional.class, Principal.class)))
        .isTrue();
  }
}
