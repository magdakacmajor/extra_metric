class LocalConnectionFactoryBeanTests {
  @Test
  public void testCreatesVanillaConnectionFactoryIfNoConnectionManagerHasBeenConfigured()
      throws Exception {
    ManagedConnectionFactory managedConnectionFactory = mock(ManagedConnectionFactory.class);
    ConnectionManager connectionManager = mock(ConnectionManager.class);
    LocalConnectionFactoryBean factory = new LocalConnectionFactoryBean();
    factory.setManagedConnectionFactory(managedConnectionFactory);
    factory.setConnectionManager(connectionManager);
    factory.afterPropertiesSet();
    verify(managedConnectionFactory).createConnectionFactory(connectionManager);
  }
}
