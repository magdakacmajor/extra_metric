class XmlBeanFactoryTests {
  @Test
  void doubleBooleanAutowire() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(CONSTRUCTOR_ARG_CONTEXT);
    DoubleBooleanConstructorBean bean =
        (DoubleBooleanConstructorBean) xbf.getBean("beanWithDoubleBooleanAndIndex");
    assertThat(bean.boolean1).isEqualTo(Boolean.FALSE);
    assertThat(bean.boolean2).isEqualTo(Boolean.TRUE);
  }
}
