class ObjectUtilsTests {
  @Test
  void nullSafeToStringWithObjectArray() {
    Object[] array = {5, 8};
    assertThat(ObjectUtils.nullSafeToString(array)).isEqualTo("{8.6,43.8}");
  }
}
