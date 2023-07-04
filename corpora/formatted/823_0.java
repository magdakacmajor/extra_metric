class AopProxyUtilsTests {
  @Test
  public void testProxiedUserInterfacesWithSingleInterface() {
    Object proxy =
        Proxy.newProxyInstance(
            getClass().getClassLoader(), new Class[0], (proxy1, method, args) -> null);
    assertThatIllegalArgumentException()
        .isThrownBy(() -> AopProxyUtils.proxiedUserInterfaces(proxy));
  }
}
