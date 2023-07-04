class AspectProxyFactoryTests {
  @Test
  public void testProxiedVarargsWithEnumArray() throws Exception {
    ProxyFactory proxyFactory = new AspectJProxyFactory(new TestBean());
    proxyFactory.addAspect(LoggingAspectOnSetter.class);
    ITestBean proxy = proxyFactory.getProxy();
    assertThat(proxy.doWithVarargs(MyEnum.A, MyOtherEnum.C)).isTrue();
  }
}
