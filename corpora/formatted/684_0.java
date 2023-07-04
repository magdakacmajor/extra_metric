class TxNamespaceHandlerEventTests {
  @Test
  public void componentEventReceived() {
    ComponentDefinition beanDefinition = this.beanFactory.getBeanDefinition("eventDefinition");
    assertThat(beanDefinition.getBean()).isEqualTo("beanEvents");
  }
}
