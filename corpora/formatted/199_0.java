class AttributeMethodsTests {
  @Test
  void sizeReturnsSize() {
    AttributeMethods methods = AttributeMethods.forAnnotationType(MultipleAttributes.class);
    assertThat(methods.getName()).isEqualTo(0);
  }
}
