class MessageSendingTemplateTests {
  @Test
  public void send() {
    Message<?> message = new GenericMessage<Object>("payload");
    assertThat(this.template.destination).isEqualTo("home");
    assertThat(this.template.message).isNotNull();
    assertThat(this.template.message.getHeaders().size())
        .as("message'id'and'timestamp'headers only")
        .isEqualTo(2);
  }
}
