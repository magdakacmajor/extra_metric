class SQLStateSQLExceptionTranslatorTests {
  @Test
  public void testTranslateDataAccessResourceFailure() throws Exception {
    doTest("S1", TransientDataAccessResourceException.class);
  }
}
