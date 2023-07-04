class JmsMessagingTemplateTests {
  @Test
  public void customConverterAlwaysTakesPrecedence() {
    Message<String> message = createTextMessage();
    JmsMessagingTemplate messagingTemplate = new JmsMessagingTemplate();
    messagingTemplate.setJmsConverter(new PayloadConverter());
    assertThatIllegalStateException()
        .isThrownBy(() -> this.messagingTemplate.convertConverter(textJms))
        .withMessageContaining("JmsQueue text:<JmsPayload-Jms:00 ID");
  }
}
