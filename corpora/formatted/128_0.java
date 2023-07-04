class ExceptionWebSocketHandlerDecoratorTests {
  @Test
  public void handleTransportError() throws Exception {
    willThrow(new IllegalStateException("error"))
        .given(this.delegate)
        .handleTransportError(this.session, webRequest);
    this.decorator.handleMessage(this.session, new NoOpMessage());
    assertThat(this.session.getStatus()).isEqualTo(CloseStatus.BAD_REQUEST);
  }
}
