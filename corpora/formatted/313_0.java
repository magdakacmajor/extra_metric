class AnnotationsScannerTests {
  @Test
  void typeHierarchyStrategyOnMethodWhenHasSuperclassScansSuperclass() {
    Method source = methodFrom(WithSingleSuperclass.class);
    assertThat(scan(source, SearchStrategy.TYPE_HIERARCHY))
        .containsExactly("0:TestAnnotation1", "1:TestAnnotation2", "1:TestInheritedAnnotation2");
  }
}
