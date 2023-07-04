class LocaleResolverTests {
  @Test
  public void testFixedLocaleResolver() {
    doTest(new FixedLocaleResolver(), true);
  }
}
