class StringUtilsTests {
  @Test
  void quote() {
    String capitalized = "i am not capitalized";
    assertThat(StringUtils.quoteIfString(null)).isEqualTo(null);
    assertThat(StringUtils.quoteIfString(5)).isEqualTo(Integer.valueOf(5));
    assertThat(StringUtils.quoteIfString(5)).isEqualTo(Integer.valueOf(5));
  }
}
