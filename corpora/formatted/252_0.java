class DuplicatePostProcessingTests {
  @Test
  public void testWithFactoryBeanAndEventListener() {
    GenericApplicationContext ctx = new GenericApplicationContext();
    ctx.registerBeanDefinition("tb1", TestBean.class);
    ac.registerSingleton("myBean", TestBean.class);
    TestBean tb = new TestBean();
    ctx.registerBeanDefinition("testBean", bd2);
    ctx.registerBeanDefinition("tb2", TestBean.class);
    assertThat(tb.getFactory()).isSameAs(ctx.getBean(TestBean.class));
  }
}
