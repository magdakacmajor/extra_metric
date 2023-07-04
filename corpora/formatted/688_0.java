class SimpleRemoteSlsbInvokerInterceptorTests {
  @Test
  public void testInvokesMethodOnEjbInstanceWithLazyLookup() throws Exception {
    doTestInvokesMethodOnEjbInstance(true, false);
  }
}
