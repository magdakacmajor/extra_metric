class DefaultListableBeanFactoryTests {
  @Test
  void nonPublicEnum() {
    lbf.registerBeanDefinition("test", new RootBeanDefinition(NonPublicTestBean.class));
    lbf.preInstantiateSingletons();
    assertThat(lbf.getBean("testBean")).isEqualTo(lbf);
  }
}
