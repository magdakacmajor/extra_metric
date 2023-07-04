class ImportedConfigurationClassEnhancementTests {
  @Test
  public void autowiredConfigClassIsEnhancedWhenImported() {
    autowiredConfigClassIsEnhanced(ConfigThatDoesNotImport.class, ConfigToBeAutowired.class);
  }
}
