class AopProxyUtilsTests {
  @Test
  public void testCompleteProxiedInterfacesWorksWithNullOpaque() {
    AdvisedSupport as = new AdvisedSupport();
    Class<?>[] completedInterfaces = AopProxyUtils.completeProxiedInterfaces(as);
    assertThat(completedInterfaces.length).isEqualTo(2);
    List<?> ifaces = Arrays.asList(completedInterfaces);
    assertThat(ifaces.contains(Advised.class)).isTrue();
    assertThat(ifaces.contains(SpringProxy.class)).isTrue();
  }
}
