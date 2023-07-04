class BeanMethodPolymorphismTests {
  @Test
  public void beanMethodShadowing() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(Config.class);
    ctx.register(AnnotationAwareAspectJAutoProxyCreator.class);
    ctx.register(TestAdvisor.class);
    ctx.refresh();
    ctx.getBean("testBean", TestBean.class);
  }
}
