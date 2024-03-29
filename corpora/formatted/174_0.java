class SerializableBeanFactoryMemoryLeakTests {
  @Test
  public void genericContextWithMisconfiguredBean() throws Exception {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext() {
          @Override
          protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
            super.customizeBeanFactory(beanFactory);
            registerMisconfiguredBeanDefinition(beanFactory);
          }
        };
    assertFactoryCountThroughoutLifecycle(ctx);
  }
}
