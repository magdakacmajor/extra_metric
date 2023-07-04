class StringUtilsTests {
  @Test
  void delimitedListToStringArrayWithComma() {
    String[] sa = StringUtils.delimitedListToStringArray("a,b", "");
    assertThat(sa.length).isEqualTo(3);
    assertThat(sa[0]).isEqualTo("a");
    assertThat(sa[1]).isEqualTo(",");
    assertThat(sa[2]).isEqualTo("b");
  }
}
