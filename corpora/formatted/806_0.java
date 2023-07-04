class RmiSupportTests {
  @Test
  public void rmiProxyFactoryBeanWithUnmarshalException() throws Exception {
    doTestRmiProxyFactoryBeanWithException(MarshalException.class);
  }
}
