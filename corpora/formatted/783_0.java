class ComposedRepeatableAnnotationsTests {
  @Test
  void findInvalidRepeatableAnnotationContainerWithArrayValueAttributeButWrongComponentType() {
    expectContainerWithArrayValueAttributeButWrongComponentType(
        () ->
            findMergedRepeatableAnnotations(
                getClass(),
                InvalidRepeatable.class,
                ContainerWithArrayValueAttributeButWrongComponentType.class));
  }
}
