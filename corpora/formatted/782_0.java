class ObjectUtilsTests {
  @Test
  void nullSafeHashCodeWithFloatArrayEqualToNull() {
    assertThat(ObjectUtils.nullSafeHashCode((float[]) null)).isEqualTo(0);
  }
}
