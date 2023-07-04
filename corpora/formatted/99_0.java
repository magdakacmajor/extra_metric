class ObjectUtilsTests {
  @Test
  void isPrimitiveOrWrapperWithBooleanPrimitiveClass() {
    assertThat(ClassUtils.isPrimitiveOrWrapper(boolean.class)).isTrue();
  }
}
