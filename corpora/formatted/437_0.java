class AcceptHeaderLocaleResolverTests {
  @Test
  public void defaultLocale() {
    assertThat(this.resolver.resolveLocale(Locale.CANADA)).isEqualTo(CANADA);
    assertThat(this.resolver.resolveLocale(request(US, CANADA))).isEqualTo(Locale.US);
  }
}
