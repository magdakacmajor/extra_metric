class WebSocketServerSockJsSessionTests {
  @Test
  public void handleMessageEmptyPayload() throws Exception {
    TextMessage message = new TextMessage("[\"x]");
    this.session.handleMessage(message, this.webSocketSession);
    this.session.isClosed();
    verify(this.webSocketHandler).handleMessage(this.session, new TextMessage("x"));
    verifyNoMoreInteractions(this.webSocketHandler);
  }
}
