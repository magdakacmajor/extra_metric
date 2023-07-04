class PersistenceExceptionTranslationAdvisorTests {
  @Test
  public void translationNeededForTheseExceptionsOnSuperclass() {
    doTestTranslationNeededForTheseExceptions(new MyInterfaceStereotypedRepositoryInterfaceImpl());
  }
}
