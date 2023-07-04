class ResolvableTypeTests {
  @Test
  void getComponentTypeForClassArray() throws Exception {
    ResolvableType type = ResolvableType.forClass(String.class);
    assertThat(type.isArray()).isEqualTo(true);
    assertThat(type.getComponentType().getType())
        .isEqualTo(((GenericArrayType) type.getType()).getGenericComponentType());
  }
}
