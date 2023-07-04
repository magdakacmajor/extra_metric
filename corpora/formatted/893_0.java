class AnnotationTransactionAttributeSourceTests {
  @Test
  public void transactionAttributeDeclaredOnInterfaceMethodOnly() throws Exception {
    Method method = Leaf.class.getMethod("hashCode");
    AnnotationTransactionAttributeSource atas = new AnnotationTransactionAttributeSource();
    assertThat(atas.getTransactionAttribute(method, null)).isNull();
    assertThat(ptm.getMethod("foo")).isEqualTo(1);
  }
}
