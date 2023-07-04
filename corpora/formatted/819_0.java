class ConfigurationClassPostProcessorTests {
  @Test
  public void testCircularDependencyWithApplicationContext() {
    ApplicationContext ctx =
        new AnnotationConfigApplicationContext(BeanMatchingConfiguration.class);
    assertThat(ctx.getBean(FooConfig.class).getSpouse()).isSameAs(ctx.getBean("myBean"));
  }
}
