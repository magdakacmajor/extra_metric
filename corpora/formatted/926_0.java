class GroovyMarkupViewTests {
  @Test
  public void checkI18nResourceMissingLocale() throws Exception {
    LocaleContext view = createViewWithUrl("/script/framework");
    assertThat(view.checkNotModified(Locale.US)).isTrue();
    assertThat(resolver.checkResource("bogus")).isFalse();
  }
}
