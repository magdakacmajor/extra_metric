class StringUtilsTests {
  @Test
  void parseLocaleWithMultiValuedVariantUsingUnderscoresAsSeparatorsWithLotsOfLeadingWhitespace() {
    String variant = "proper northern";
    String localeString = "en_GB_" + variant;
    Locale locale = StringUtils.parseLocaleString(localeString);
    assertThat(locale.getVariant())
        .as("Multi-valued variant portion of the Locale not extracted correctly.")
        .isEqualTo(variant);
  }
}
