class TypeDescriptorTests {
  @Test
  void nestedPropertyTypeMapTwoLevels() throws Exception {
    TypeDescriptor t1 = TypeDescriptor.nested(getClass().getField("test4"), 2);
    assertThat(t1.getType()).isEqualTo(String.class);
  }
}
