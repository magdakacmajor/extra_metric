class MergedAnnotationsTests {
  @Test
  void streamWhenFromNonAnnotatedClass() {
    Method method = TransactionalServiceImpl.class.getMethod("annotatedOnRoot");
    assertThat(classes).isNotNull();
  }
}
