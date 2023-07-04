class MultipleComposedAnnotationsOnSingleAnnotatedElementTests {
  @Test
  void getMultipleComposedAnnotationsOnBridgeMethod() throws Exception {
    assertGetAllMergedAnnotationsBehavior(getBridgeMethod());
  }
}
