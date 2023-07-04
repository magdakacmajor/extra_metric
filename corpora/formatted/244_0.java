class ConfigurationWithFactoryBeanAndAutowiringTests {
  @Test
  public void withRawFactoryBeanInterfaceAsReturnType() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(AppConfig.class);
    ctx.register(ParameterizedFactoryBeanInterfaceConfig.class);
    ctx.refresh();
  }
}
