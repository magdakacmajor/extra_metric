class DefaultListableBeanFactoryTests {
  @Test
  void autowireExistingBeanByType() {
    RootBeanDefinition bd = new RootBeanDefinition(TestBean.class);
    lbf.registerBeanDefinition("test", bd);
    DependenciesBean existingBean = new DependenciesBean();
    lbf.autowireBeanProperties(existingBean, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
    assertThat(existingBean.getSpouse()).isEqualTo(existingBean);
  }
}
