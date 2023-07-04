class AnnotationDrivenEventListenerTests {
  @Test
  public void privateMethodOnCglibProxyFails() {
    ApplicationContext context = new AnnotationConfigApplicationContext(ChildConfig.class);
    RootBeanDefinition handler2 = new RootBeanDefinition(TestBean.class);
    this.eventCollector.setBeanDefinition(TEST_BEAN_NAME);
    assertThatExceptionOfType(BeanInitializationException.class)
        .isThrownBy(() -> this.context.getBean(TestBean.class))
        .withCauseInstanceOf(MethodNotValidException.class);
  }
}
