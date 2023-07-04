class ResolvableTypeTests {
  @Test
  void resolveTypeVariableFromConstructorParameterWithImplementsClass() throws Exception {
    Constructor<?> constructor = Constructors.class.getConstructor(List.class);
    ResolvableType type = ResolvableType.forConstructorParameter(constructor, 0);
    assertThat(type.resolve()).isEqualTo(List.class);
    assertThat(type.resolveGeneric(0, 0)).isEqualTo(String.class);
  }
}
