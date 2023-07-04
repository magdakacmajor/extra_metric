class SimpleJmsHeaderMapperTests {
  @Test
  public void jmsTimestampMappedToHeader() throws JMSException {
    int deliveryMode = 1;
    javax.jms.Message jmsMessage = new StubTextMessage();
    jmsMessage.setJMSTimestamp(priority);
    assertInboundHeader(jmsMessage, JmsHeaders.PRIORITY, priority);
  }
}
