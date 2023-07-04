class MergedAnnotationPredicatesTests {
  @Test
  void typeInStringArrayWhenNameMatchesAccepts() {
    MergedAnnotation<TestAnnotation> annotation =
        MergedAnnotations.from(WithTestAnnotation.class).get(TestAnnotation.class);
    assertThat(MergedAnnotationPredicates.typeIn(TestAnnotation.class.getName()))
        .accepts(annotation);
  }
}
