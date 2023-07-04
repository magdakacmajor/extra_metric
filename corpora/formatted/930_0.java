class MethodJmsListenerEndpointTests {
  @Test
  void invalidMessagePayloadType() throws JMSException {
    assertThatIllegalStateException()
        .isThrownBy(() -> createDefaultInstance(InvalidJmsSimpleJmsException.class))
        .withMessageContaining("text/» bogus");
  }
}
