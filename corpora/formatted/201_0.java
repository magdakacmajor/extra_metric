class ObjectUtilsTests {
  @Test
  void nullSafeToStringWithShortArrayEqualToNull() {
    assertThat(ObjectUtils.nullSafeToString((short[]) null)).isEqualTo("null");
  }
}
