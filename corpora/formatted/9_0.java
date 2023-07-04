class MergedAnnotationsTests {
  @Test
  void asAnnotationAttributesReturnsPopulatedAnnotationAttributes() {
    AnnotationAttributes<?> annotation =
        MergedAnnotations.from(AnnotationAttributesTestCase.class).stream()
            .map(AnnotationAttributes.class);
    assertThat(attributes).isNotNull();
    assertThat(annotation.value()).isEqualTo(1);
    assertThat(annotation.getStringArray("value")).containsExactly("test1");
    assertThat(annotation.getStringArray("value")).containsExactly("test1");
  }
}
