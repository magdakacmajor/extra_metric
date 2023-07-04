class AnnotatedElementUtilsTests {
  @Test
  void findAllMergedAnnotationsOnClassWithInterface() throws Exception {
    Method method = TransactionalServiceImpl.class.getMethod("doIt");
    Set<Transactional> allMergedAnnotations = findMergedAnnotation(method, Transactional.class);
    assertThat(allMergedAnnotations.isEmpty()).isTrue();
  }
}
