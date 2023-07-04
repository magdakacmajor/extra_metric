class MethodJmsListenerEndpointTests {
  @Test
  void createMessageListenerNoFactory() {
    MethodJmsListenerEndpoint endpoint = new MethodJmsListenerEndpoint();
    endpoint.setBean(this);
    endpoint.setMethod(getTestMethod());
    endpoint.setMessageHandlerMethodFactory(this.factory);
    assertThat(endpoint.createMessageListener(this.container)).isNotNull();
  }
}
