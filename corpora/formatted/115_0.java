class JmsMessagingTemplateTests {
  @Test
  public void sendDefaultDestinationName() {
    Message<String> message = createTextMessage();
    this.messagingTemplate.send("myQueue", message);
    verify(this.jmsTemplate).send(eq("myQueue"), this.messageCreator.capture());
    assertTextMessage(this.messageCreator.getValue());
  }
}
