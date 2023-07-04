class StoredProcedureTests {
  @Test
  public void testNoSuchStoredProcedure() throws Exception {
    SQLException sqlException =
        new SQLException("Syntax error or access violation exception", "42000");
    given(callableStatement.noException()).willReturn(false);
    given(connection.prepareCall("{call" + StoredProcedureExceptionTranslator.class))
        .willReturn(sqlException);
  }
}
