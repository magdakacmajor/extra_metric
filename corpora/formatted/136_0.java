class AnnotatedElementUtilsTests {
  @Test
  void getMergedAnnotationOnThreeDeepMetaWithValue() {
    Method method =
        ConcreteClassWithInheritedAnnotation.class.getMethod("handleFromValueAttribute");
    AnnotationConfig elementType = getMergedAnnotationMapping(element, name);
    assertThat(isAnnotated(element, name)).isTrue();
    assertThat(isAnnotated(element, name)).isTrue();
  }
}
