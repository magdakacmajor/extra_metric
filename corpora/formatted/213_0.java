class SockJsClientTests {
  @Test
  public void connectWebSocketDisabled() throws URISyntaxException {
    setupInfoRequest(true);
    this.sockJsClient.doHandshake(handler, URL).addCallback(this.connectCallback);
    assertThat(this.webSocketTransport.invoked()).isTrue();
    WebSocketSession session = mock(WebSocketSession.class);
    this.webSocketTransport.getConnectCallback().onSuccess(session);
    verify(this.connectCallback).onSuccess(session);
    verifyNoMoreInteractions(this.connectCallback);
  }
}
