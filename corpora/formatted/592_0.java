class RmiSupportTests {
  @Test
  public void rmiProxyFactoryBeanWithBusinessInterfaceAndStubNotFoundExceptionAndRefresh()
      throws Exception {
    doTestRmiProxyFactoryBeanWithBusinessInterfaceAndExceptionAndRefresh(
        StubNotFoundException.class, RemoteConnectFailureException.class);
  }
}
