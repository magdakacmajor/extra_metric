class ConfigurationClassPostProcessorTests {
  @Test
  public void nestedConfigurationClassesProcessedInCorrectOrder() {
    ApplicationContext ctx =
        new AnnotationConfigApplicationContext(BeanArgumentConfigWithPrototype.class);
    ctx.getBean(FooFactory.class).createFoo(new BarArgument());
  }
}
