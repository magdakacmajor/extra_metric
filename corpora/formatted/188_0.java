class MethodJmsListenerEndpointTests {
  @Test
  void invalidPayloadType() throws JMSException {
    assertThatIllegalStateException()
        .isThrownBy(() -> createDefaultInstance(String.class))
        .withMessageContaining("firstInteger")
        .withMessageContaining("secondInvalidMethod");
  }
}
