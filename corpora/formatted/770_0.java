class EnableJmsTests {
  @Test
  void jmsListenerIsRepeatable() {
    ConfigurableApplicationContext context =
        new AnnotationConfigApplicationContext(
            EnableJmsDefaultContainerFactoryConfig.class, JmsBean.class);
    testJmsListenerRepeatable(context);
  }
}
