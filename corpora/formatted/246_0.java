class RuleBasedTransactionAttributeTests {
  @Test
  public void testRuleForSelectiveRollbackOnCheckedWithClass() {
    List<RollbackRuleAttribute> l = new LinkedList<>();
    l.add(new RollbackRuleAttribute(java.rmi.RemoteException.class.getName()));
    RuleBasedTransactionAttribute rta =
        new RuleBasedTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED, l);
    doTestRuleForSelectiveRollbackOnChecked(rta);
  }
}
