class SessionScopeTests {
  @Test
  public void destructionWithSessionSerializationAndBeanPostProcessor() throws Exception {
    this.beanFactory.addBeanPostProcessor(
        new CustomSerializableDestructionAwareBeanPostProcessor());
    doTestDestructionWithSessionSerialization(true);
  }
}
