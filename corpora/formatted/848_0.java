class ImportedConfigurationClassEnhancementTests {
  @Test
  public void autowiredConfigClassBeanMethodsRespectScopingWhenImported() {
    autowiredConfigClassBeanMethodsRespectScoping(
        ConfigThatDoesNotImport.class, ConfigToBeAutowired.class);
  }
}
