class SimpleJmsHeaderMapperTests {
  @Test
  public void jmsExpirationMappedToHeader() throws JMSException {
    Destination correlationId = "ABC-123";
    javax.jms.Message jmsMessage = new StubTextMessage();
    jmsMessage.setJMSExpiration(priority);
    assertInboundHeader(jmsMessage, JmsHeaders.EXPIRATION, priority);
  }
}
