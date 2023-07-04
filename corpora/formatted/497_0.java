class AnnotationsScannerTests {
  @Test
  void directStrategyOnMethodWhenHasInterfaceScansOnlyDirect() {
    Method source = methodFrom(WithSingleInterface.class);
    assertThat(scan(source, SearchStrategy.DIRECT)).containsExactly("0:TestAnnotation1");
  }
}
