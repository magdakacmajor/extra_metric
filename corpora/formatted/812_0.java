class SimpleJmsHeaderMapperTests {
  @Test
  public void userDefinedPropertyWithUnsupportedType() throws JMSException {
    javax.jms.Message jmsMessage = new StubTextMessage();
    jmsMessage.setIntProperty("foo", 123);
    assertInboundHeader(jmsMessage, "foo", 123);
  }
}
