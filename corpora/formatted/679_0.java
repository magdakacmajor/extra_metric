class JmsInvokerTests {
  @Test
  public void testJmsInvokerProxyFactoryBeanAndServiceExporter() throws Throwable {
    given(mockSession.createQueue("myQueue")).willReturn(mockQueue);
    doTestJmsInvokerProxyFactoryBeanAndServiceExporter(true);
  }
}
