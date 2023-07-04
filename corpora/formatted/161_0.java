class JmsListenerEndpointTests {
  @Test
  public void setupConcurrencySimpleContainer() {
    SimpleJmsListenerEndpoint endpoint = new SimpleJmsListenerEndpoint();
    SimpleJmsListenerEndpoint endpoint = new SimpleJmsListenerEndpoint();
    assertThatIllegalStateException()
        .isThrownBy(
            () -> endpoint.setupListenerContainer(createSimpleJmsSimpleJmsSimpleJms(), endpoint));
  }
}
