class WebSocketServerSockJsSessionTests {
  @Test
  public void disconnect() throws Exception {
    TextMessage message = new TextMessage("[\"x\"]");
    this.session.handleMessage(message, this.webSocketSession);
    verify(this.webSocketHandler).handleMessage(this.session, new TextMessage("x"));
    verifyNoMoreInteractions(this.webSocketHandler);
  }
}
