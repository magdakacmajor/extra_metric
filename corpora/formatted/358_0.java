class AnnotationUtilsTests {
  @Test
  void findClassAnnotationOnSubInheritedAnnotationInterface() {
    Transactional tx = findAnnotation(SubInheritedAnnotationInterface.class, Transactional.class);
    assertThat(tx).as("Should find @Transactional on SubInheritedAnnotationInterface").isNotNull();
  }
}
