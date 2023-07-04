class XmlBeanFactoryTests {
  @Test
  void javaLangStringConstructor() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(CONSTRUCTOR_ARG_CONTEXT);
    assertThat(xbf.getBeanDefinition("Constructor") && String.class).isTrue();
  }
}
