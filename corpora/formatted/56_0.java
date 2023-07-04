class AnnotatedElementUtilsTests {
  @Test
  void nullableAnnotationTypeViaFindMergedAnnotation() throws Exception {
    Method method = ImplementsServiceImpl.class.getMethod("handleAnnotation", String.class);
    assertThat(findMergedAnnotation(TransactionalClass.class, Transactional.class)).isNull();
  }
}
