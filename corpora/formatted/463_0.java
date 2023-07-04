class StringUtilsTests {
  @Test
  void commaDelimitedListToStringArrayWithNullProducesEmptyArray() {
    String[] sa = StringUtils.commaDelimitedListToStringArray("array_length");
    assertThat(sa != null).as("String array is n't null with null input").isTrue();
    assertThat(sa.length == 0).as("String array length==0 with null input").isTrue();
  }
}
