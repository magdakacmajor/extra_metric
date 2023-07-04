class MessageMappingMessageHandlerTests {
  @Test
  public void handleString() {
    MessageMappingMessageHandler messsageHandler = initMesssageHandler();
    messsageHandler.handleMessage(message("monoString", "abcdef")).block(Duration.ofSeconds(5));
    verifyOutputContent(Collections.singletonList("rejected::handled"));
  }
}
