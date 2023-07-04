class MessagingMessageListenerAdapterTests {
  @Test
  public void replyJacksonMessageAndJsonView() throws JMSException {
    TextMessage reply =
        testReplyWithJackson("replyJacksonPojoAndJsonView", "{\"name\":\"Response\"}");
    verify(reply, never()).setObjectProperty("foo", "bar");
  }
}
