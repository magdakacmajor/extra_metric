class JmsMessagingTemplateTests {
  @Test
  public void receiveAndConvertName() {
    javax.jms.Message jmsMessage = createJmsTextMessage("my Payload");
    given(this.jmsTemplate.receive("myQueue")).willReturn(jmsMessage);
    String payload = this.messagingTemplate.receiveAndConvert(String.class);
    assertThat(payload).isEqualTo("my Payload");
    verify(this.jmsTemplate).receive("myQueue");
  }
}
