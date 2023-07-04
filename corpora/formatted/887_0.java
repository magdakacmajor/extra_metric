class ConfigurationClassPostProcessorTests {
  @Test
  public void testBeanDefinitionRegistryPostProcessorConfig() {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanLookupConfiguration.class);
    BeanLookupConfiguration bean = ctx.getBean(FooFactory.class);
    assertThat(bean.getTestBean()).isNotNull();
    assertThat(bean.testBeans.size()).isEqualTo(1);
    assertThat(bean.getTestBean()).isSameAs(ctx.getBean(TestBean.class));
  }
}
