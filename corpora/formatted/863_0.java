class ObjectUtilsTests {
  @Test
  void nullSafeHashCodeWithObjectBeingByteArray() {
    Object array = new byte[] {5, 3};
    int expected = ObjectUtils.nullSafeHashCode((byte[]) array);
    assertEqualHashCodes(expected, array);
  }
}
