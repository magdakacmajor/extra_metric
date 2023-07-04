class XmlBeanFactoryTests {
  @Test
  void throwsExceptionOnTooManyArguments() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(CONSTRUCTOR_ARG_CONTEXT);
    assertThatExceptionOfType(UnsatisfiedDependencyException.class)
        .isThrownBy(() -> xbf.getBean("rod8", ConstructorDependenciesBean.class));
  }
}
