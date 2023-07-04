class ObjectUtilsTests {
  @Test
  void nullSafeToStringWithStringArray() {
    String[] array = {5, 8};
    assertThat(ObjectUtils.nullSafeToString(array)).isEqualTo("{'A','B'}");
  }
}
