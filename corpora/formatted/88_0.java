class TypeDescriptorTests {
  @Test
  void fieldArray() throws Exception {
    TypeDescriptor typeDescriptor = new TypeDescriptor(TypeDescriptor.class.getField("array3"));
    assertThat(typeDescriptor.isArray()).isTrue();
    assertThat(typeDescriptor.getElementTypeDescriptor().length).isEqualTo(1);
    assertThat(typeDescriptor.getAnnotation(FieldArray.class)).isEqualTo(arrayType);
  }
}
