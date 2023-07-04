class DataAccessUtilsTests {
  @Test
  public void exceptionTranslationWithTranslation() {
    MapPersistenceExceptionTranslator mpet = new MapPersistenceExceptionTranslator();
    RuntimeException in = new RuntimeException();
    assertThat(DataAccessUtils.translateIfNecessary(in, mpet)).isSameAs(in);
  }
}
