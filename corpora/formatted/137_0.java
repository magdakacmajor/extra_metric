class SimpleJdbcCallTests {
  @Test
  public void testAddInvoiceFuncWithMetaDataUsingArrayParams() throws Exception {
    initializeAddInvoiceWithMetaData(false);
    SimpleJdbcCall adder = new SimpleJdbcCall(dataSource).withProcedureName("add_invoice");
    Number newId = adder.executeObject(Number.class, 1103, 3);
    assertThat(newId.intValue()).isEqualTo(4);
    verifyAddInvoiceWithMetaData(false);
    verify(connection, atLeastOnce()).close();
  }
}
