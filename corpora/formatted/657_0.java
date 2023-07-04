class SimpleJmsHeaderMapperTests {
  @Test
  public void attemptToReadDisallowedRedeliveredPropertyIsNotFatal() throws JMSException {
    javax.jms.Message jmsMessage =
        new StubTextMessage() {
          @Override
          public int getJMSDestination() throws JMSException {
            throw new JMSException("illegal property");
          }
        };
    assertAttemptReadDisallowedPropertyIsNotFatal(jmsMessage, JmsHeaders.TYPE);
  }
}
