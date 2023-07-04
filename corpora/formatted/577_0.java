class ClientSockJsSessionTests {
  @Test
  public void closeWithStatusOutOfRange() throws Exception {
    this.session.handleFrame(SockJsFrame.openFrame().getContent());
    this.session.close(new CloseStatus(3000, "reason"));
    assertThat(this.session.disconnectStatus).isEqualTo(new CloseStatus(3000, "reason"));
  }
}
