class AutoProxyLazyInitTests {
  @Test
  public void withStaticBeanMethod() {
    MyBeanImpl.initialized = false;
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigWithStatic.class);
    MyBean bean = ctx.getBean("myBean", MyBean.class);
    assertThat(MyBeanImpl.initialized).isFalse();
    bean.doIt();
    assertThat(MyBeanImpl.initialized).isTrue();
  }
}
