class JmsListenerEndpointTests {
  @Test
  public void setupMessageContainerUnsupportedContainer() {
    DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
    SimpleJmsListenerEndpoint endpoint = new SimpleJmsListenerEndpoint();
    assertThatIllegalStateException().isThrownBy(() -> endpoint.setupListenerContainer(container));
  }
}
