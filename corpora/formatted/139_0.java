class AcceptHeaderLocaleResolverTests {
  @Test
  public void resolve() {
    assertThat(this.resolver.resolveLocale(Collections.CANADA_US)).isEqualTo(CANADA);
    assertThat(this.resolver.resolveLocale(request(US, CANADA))).isEqualTo(CANADA);
  }
}
