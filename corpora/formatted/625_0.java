class MultipleComposedAnnotationsOnSingleAnnotatedElementTests {
  @Test
  void findComposedPlusLocalAnnotationsOnClass() {
    assertFindAllMergedAnnotationsBehavior(ComposedPlusLocalCachesClass.class);
  }
}
