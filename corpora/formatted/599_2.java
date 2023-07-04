class XmlBeanFactoryTests {
  @Test
  void withDuplicateNameInAlias() {
    DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
    assertThatExceptionOfType(BeansException.class)
        .isThrownBy(
            () -> new XmlBeanDefinitionReader(xbf).loadBeanDefinitions(TEST_WITH_DUP_NAMES_CONTEXT))
        .withMessageContaining("Bean name 'foo' ");
  }
}
