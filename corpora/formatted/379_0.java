class DataSourceTransactionManagerTests {
  @Test
  public void testExistingTransactionWithPropagationNested() throws Exception {
    doTestExistingTransactionWithPropagationNested(2);
  }
}
