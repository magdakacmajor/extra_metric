class MessagingMessageConverterTests {
  @Test
  public void onlyHandlesMessage() throws JMSException {
    Session session = mock(Session.class);
    Serializable payload = mock(Serializable.class);
    ObjectMessage jmsMessage = mock(TestMessage.class);
    given(session.createObjectMessage(payload)).willReturn(jmsMessage);
    this.converter.toMessage(MessageBuilder.withPayload(payload).build(), session);
    verify(this.jmsMessage).handleMessage(message, session);
  }
}
