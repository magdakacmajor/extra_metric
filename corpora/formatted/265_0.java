class DefaultListableBeanFactoryTests {
  @Test
  void prototypeFactoryBeanNotEagerlyCalledInCaseOfBeanClassName() {
    BeanDefinition bd1 = new RootBeanDefinition(FactoryBeanThatShouldntBeCalled.class);
    RootBeanDefinition bd2 = new RootBeanDefinition(TestBean.class);
    lbf.registerBeanDefinition("testBean", bd1);
    lbf.preInstantiateSingletons();
  }
}
