class AnnotationsScannerTests {
  @Test
  void inheritedAnnotationsStrategyOnClassWhenNotAnnoatedScansNone() {
    Class<?> source = WithNoAnnotations.class;
    assertThat(scan(source, SearchStrategy.INHERITED_ANNOTATIONS)).isEmpty();
  }
}
