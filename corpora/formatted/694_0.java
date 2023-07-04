class WebSocketStompClientTests {
  @Test
  public void webSocketHandshakeFailure() throws Exception {
    IllegalStateException exception = new IllegalStateException("simulated exception");
    connect().processFailure(this.webSocketSession, exception);
    verify(this.stompSession).handleFailure(same(exception));
  }
}
