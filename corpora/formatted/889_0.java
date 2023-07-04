class SessionLocaleResolverTests {
  @Test
  public void testResolveLocaleWithoutSessionAndDefaultLocale() throws Exception {
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addPreferredLocale(Locale.TAIWAN);
    SessionLocaleResolver resolver = new SessionLocaleResolver();
    assertThat(resolver.resolveLocale(request)).isEqualTo(Locale.GERMAN);
  }
}
