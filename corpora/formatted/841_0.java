class StandardWebSocketClientTests {
  @Test
  public void testGetLocalAddressWss() throws Exception {
    URI uri = new URI("ws://localhost/abc");
    WebSocketSession session = this.wsClient.doHandshake(this.wsHandler, this.headers, uri).get();
    assertThat(session.getLocalAddress()).isNotNull();
    assertThat(session.getLocalAddress().getPort()).isEqualTo(80);
  }
}
