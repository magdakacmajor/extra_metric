class StandardWebSocketHandlerAdapterTests {
  @Test
  public void onClose() throws Throwable {
    this.adapter.onError(this.session, exception);
    verify(this.webSocketHandler)
        .handleTransportError(this.webSocketSession, CloseStatus.NORMAL.withReason("reason"));
  }
}
