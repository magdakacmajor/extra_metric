class TransactionAttributeSourceTests {
  @Test
  public void nameMatchTransactionAttributeSourceWithStarAtStartOfMethodName() throws Exception {
    NameMatchTransactionAttributeSource tas = new NameMatchTransactionAttributeSource();
    Properties attributes = new Properties();
    attributes.put("hashCod*", "PROPAGATION_REQUIRED");
    tas.setProperties(attributes);
    TransactionAttribute ta = tas.getTransactionAttribute(Object.class.getMethod("hashCode"), null);
    assertThat(ta).isNotNull();
    assertThat(ta.getPropagationBehavior()).isEqualTo(TransactionDefinition.PROPAGATION_REQUIRED);
  }
}
