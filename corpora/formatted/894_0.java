class StringUtilsTests {
  @Test
  void availableLocalesWithLanguageTag() {
    for (Locale locale : Locale.getAvailableLocales()) {
      Locale parsedLocale = StringUtils.parseLocaleString(locale.toString());
      if (parsedLocale == null) {
        assertThat(locale.getLanguage()).isEqualTo("");
      } else {
        assertThat(locale.toString()).isEqualTo(parsedLocale.toString());
      }
    }
  }
}
