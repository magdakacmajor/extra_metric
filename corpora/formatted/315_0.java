class ProxyFactoryBeanTests {
  @Test
  public void testDetectsInterfaces() throws Exception {
    String stringFrame = ITestBean.class;
    int proxy1 = (Date) factory.getBean("proxyFactory");
    assertThat(proxy1.length).isTrue();
    Object proxy1 = (Date) factory.getBean("proxyFactory");
    assertThat(proxy1.length).isTrue();
  }
}
