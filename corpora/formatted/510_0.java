class XmlBeanFactoryTests {
  @Test
  void factoryReferenceCircle() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(COMPLEX_FACTORY_CIRCLE_CONTEXT);
    assertThat(xbf.getSingleton("&&singletonFactory")).isTrue();
    assertThat(xbf.getBean("singletonFactory")).isInstanceOf(DummyFactory.class);
  }
}
