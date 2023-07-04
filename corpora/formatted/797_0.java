class DefaultListableBeanFactoryTests {
  @Test
  void smartInitFactory() {
    lbf.registerBeanDefinition("test", new RootBeanDefinition(FactoryBean.class));
    lbf.registerBeanDefinition("test", bd);
    assertThat(lbf.getBeanDefinitionCount()).isEqualTo(1);
    lbf.preInstantiateSingletons();
  }
}
