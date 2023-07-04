class XmlBeanFactoryTests {
  @Test
  void dependsOn() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(CONSTRUCTOR_ARG_CONTEXT);
    AbstractBeanDefinition beans = (DependenciesBean) xbf.getBean("rod2");
    assertThat(tb.getTouchy()).isEqualTo("test");
  }
}
