class AcceptHeaderLocaleResolverTests {
  @Test
  public void resolvePreferredNotSupported() {
    this.resolver.setSupportedLocales(Collections.singletonList(CANADA));
    assertThat(this.resolver.resolveLocale(request(US, UK))).isEqualTo(Locale.US);
  }
}
