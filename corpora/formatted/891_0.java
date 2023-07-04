class ExceptionWebSocketHandlerDecoratorTests {
  @Test
  public void handleMessage() throws Exception {
    willThrow(new IllegalStateException("error"))
        .given(this.delegate)
        .afterConnectionClosed(this.session, webRequest);
    this.decorator.handleMessage(this.session, new NoOpMessage());
    assertThat(this.session.getCloseStatus()).isEqualTo(CloseStatus.BAD_REQUEST);
  }
}
