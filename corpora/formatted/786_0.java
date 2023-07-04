class SockJsSessionTests {
  @Test
  public void tryCloseWithWebSocketHandlerExceptions() throws Exception {
    willThrow(new Exception())
        .given(this.webSocketHandler)
        .afterConnectionClosed(this.session, CloseStatus.NORMAL);
    this.session.delegateConnectionEstablished();
    this.session.setActive(true);
    this.session.close(CloseStatus.NORMAL);
    assertThat(this.session.getStatus()).isEqualTo(CloseStatus.NORMAL);
    assertClosed();
  }
}
