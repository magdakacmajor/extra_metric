class MergedAnnotationsTests {
  @Test
  void getWithInheritedAnnotationsFavorsLocalComposedAnnotationOverInheritedAnnotation() {
    MergedAnnotation<?> annotation =
        MergedAnnotations.from(
                SubSubClassWithInheritedComposedAnnotation.class,
                SearchStrategy.INHERITED_ANNOTATIONS)
            .get(Transactional.class);
    assertThat(annotation.getBoolean("readOnly")).isFalse();
  }
}
