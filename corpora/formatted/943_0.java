class AnnotationUtilsTests {
  @Test
  void findClassAnnotationOnMetaMetaMetaAnnotatedClass() {
    Component component = findAnnotation(MetaMetaAnnotatedClass.class, Component.class);
    assertThat(component)
        .as("Should find meta-annotation on composed annotation on class")
        .isNotNull();
    assertThat(component.value()).isEqualTo("meta2");
  }
}
