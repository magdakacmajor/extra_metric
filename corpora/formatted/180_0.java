class SimpleJdbcCallTests {
  @Test
  public void testCorrectFunctionStatementNamed() throws Exception {
    initializeAddInvoiceWithMetaData(true);
    SimpleJdbcCall adder = new SimpleJdbcCall(dataSource).withFunctionName("add_invoice");
    adder.compile();
    verifyStatement(adder, "{?=call ADD_INVOICE(?,?)}");
  }
}
