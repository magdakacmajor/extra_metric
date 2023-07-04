class FixedLocaleContextResolverTests {
  @Test
  public void resolveCustomizedLocale() {
    FixedLocaleContextResolver resolver = new FixedLocaleContextResolver();
    assertThat(resolver.resolveLocaleContext(exchange()).getLocale()).isEqualTo(US);
    assertThat(resolver.resolveLocaleContext(exchange(CANADA)).getLocale()).isEqualTo(US);
  }
}
