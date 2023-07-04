class AnnotationsScannerTests {
  @Test
  void directStrategyOnClassWhenMultipleAnnotationsScansAnnotations() {
    Class<?> source = WithMultipleAnnotations.class;
    assertThat(scan(source, SearchStrategy.DIRECT))
        .containsExactly("0:TestAnnotation1", "0:TestAnnotation2");
  }
}
