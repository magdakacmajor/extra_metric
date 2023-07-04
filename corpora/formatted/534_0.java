class SimpleJmsHeaderMapperTests {
  @Test
  public void attemptToReadDisallowedTimestampPropertyIsNotFatal() throws JMSException {
    javax.jms.Message jmsMessage =
        new StubTextMessage() {
          @Override
          public int getJMSTimestamp() throws JMSException {
            throw new JMSException("illegal property");
          }
        };
    assertAttemptReadDisallowedPropertyIsNotFatal(jmsMessage, JmsHeaders.MESSAGE_ID);
  }
}
