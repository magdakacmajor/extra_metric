class AnnotatedElementUtilsTests {
  @Test
  void getMergedAnnotationWithTransitiveImplicitAliasesWithSkippedLevel() {
    assertGetMergedAnnotation(
        TransitiveImplicitAliasesWithSkippedLevelContextConfigClass.class, "test.xml");
  }
}
