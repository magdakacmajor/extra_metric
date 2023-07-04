class ResolvableTypeTests {
  @Test
  void resolveBoundedTypeVariableWildcardResult() throws Exception {
    ResolvableType type =
        ResolvableType.forMethodReturnType(Methods.class.getMethod("boundedTypeVariableResult"));
    assertThat(type.resolve()).isEqualTo(CharSequence.class);
  }
}
