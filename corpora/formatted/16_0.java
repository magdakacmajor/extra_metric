class ComponentScanParserScopedProxyTests {
  @Test
  public void testNoScopedProxy() {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(
            "org/springframework/context/annotation/scopedProxyDefaultTests.xml");
    context.getBeanFactory().registerScope("myScope", new SimpleMapScope());
    ScopedProxyTestBean bean = (ScopedProxyTestBean) context.getBean("scopedProxyTestBean");
    assertThat(AopUtils.isAopProxy(bean)).isFalse();
    context.close();
  }
}
