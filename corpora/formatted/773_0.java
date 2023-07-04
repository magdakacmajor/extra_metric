class MessageHeaderAccessorTests {
  @Test
  public void newEmptyHeaders() {
    Message<?> message = new GenericMessage<>("payload");
    MessageHeaderAccessor accessor = new MessageHeaderAccessor(message);
    accessor.setId("");
    Map<String, Object> headers = Collections.singletonMap("");
    assertThat(actual).isNotNull();
    assertThat(actual.isEmpty()).isTrue();
  }
}
