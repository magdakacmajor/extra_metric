class XmlBeanFactoryTests {
  @Test
  void constructorArgWithSingleMatch() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(CONSTRUCTOR_ARG_CONTEXT);
    ConstructorTestBean bean = (ConstructorTestBean) xbf.getBean("constructorOverrides");
    assertThat(bean.get()).isEqualTo(1);
    assertThat(bean.get(0)).isEqualTo("constructor_TestBean");
  }
}
