class NestedBeansElementAttributeRecursionTests {
  @Test
  public void defaultLazyInitWithNonValidatingParser() {
    DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(bf);
    xmlBeanDefinitionReader.setValidating(false);
    xmlBeanDefinitionReader.loadBeanDefinitions(
        new ClassPathResource(
            "NestedBeansElementAttributeRecursionTests-lazy-context.xml", this.getClass()));
    assertLazyInits(bf);
  }
}
