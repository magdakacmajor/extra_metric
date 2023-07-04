class MessageMappingMessageHandlerTests {
  @Test
  public void handleErrorSignal() {
    MessageMappingMessageHandler messsageHandler = initMesssageHandler();
    messsageHandler.handleMessage(message("exception", "abc")).block(Duration.ofSeconds(5));
    verifyOutputContent(Collections.singletonList("rejected::handled"));
  }
}
