class SQLStateSQLExceptionTranslatorTests {
  @Test
  public void testTranslateConcurrencyFailure() throws Exception {
    doTest("07", DataIntegrityViolationException.class);
  }
}
