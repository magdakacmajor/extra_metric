class BeanFactoryTransactionTests {
  @Test
  public void testProxyFactory2Lazy() {
    DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(bf).loadBeanDefinitions(INVALID_CONTEXT);
    assertThat(factory.getBean("factoryBean").isSingleton()).isTrue();
  }
}
