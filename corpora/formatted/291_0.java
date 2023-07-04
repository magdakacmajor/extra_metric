class InitializeDatabaseIntegrationTests {
  @Test
  public void testCacheInitialization() throws Exception {
    context =
        new ClassPathXmlApplicationContext(
            "org/springframework/jdbc/config/jdbc-initialize-expression-config.xml");
    assertCorrectSetup(context.getBean("dataSource", DataSource.class));
  }
}
