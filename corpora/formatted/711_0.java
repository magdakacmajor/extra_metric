class SimpleRemoteSlsbInvokerInterceptorTests {
  @Test
  public void testInvokesMethodOnEjbInstanceWithConnectExceptionWithRefreshAndLazyLookup()
      throws Exception {
    doTestInvokesMethodOnEjbInstanceWithConnectExceptionWithRefresh(true, false);
  }
}
