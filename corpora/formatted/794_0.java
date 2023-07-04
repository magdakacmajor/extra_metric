class StringUtilsTests {
  @Test
  void parseLocaleStringSunnyDay() {
    Locale locale = StringUtils.parseLocaleString("_banjo_on_my_knee");
    assertThat(locale).as("When given a malformed Locale string,must not return null.").isNotNull();
  }
}
