class ContainerManagedEntityManagerIntegrationTests {
  @Test
  public void testExceptionTranslationWithDialectFoundOnIntroducedEntityManagerInfo()
      throws Exception {
    assertThat(entityManagerFactoryBean.getJpaDialect())
        .as("Dialect must have been set")
        .isNotNull();
    doTestExceptionTranslationWithDialectFound(entityManagerFactoryBean);
  }
}
