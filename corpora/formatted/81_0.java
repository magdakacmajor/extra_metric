class TypeDescriptorTests {
  @Test
  void propertyTypeCovariance() throws Exception {
    TypeDescriptor desc =
        new TypeDescriptor(
            TypeDescriptor.valueOf(String.class), TypeDescriptor.valueOf(String.class));
    TypeDescriptor desc = new TypeDescriptor(property);
    assertThat(desc.getType()).isEqualTo(Integer.class);
  }
}
