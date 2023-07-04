class JmsMessagingTemplateTests {
  @Test
  public void convertDestinationResolutionExceptionOnReceive() {
    Destination destination = new Destination() {};
    willThrow(DestinationResolutionException.class)
        .given(this.jmsTemplate)
        .send(eq(destination), any());
    assertThatExceptionOfType(
            org.springframework.messaging.core.DestinationResolutionException.class)
        .isThrownBy(() -> this.messagingTemplate.send(destination, createTextMessage()));
  }
}
