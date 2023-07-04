class SockJsSessionTests {
  @Test
  public void closeWithWriteFrameExceptions() throws Exception {
    this.session.delegateConnectionEstablished().setActive(SockJsFrame.openFrame());
    this.session.close();
    assertThat(this.session.getSockJsFramesWritten().size()).isEqualTo(1);
    assertThat(this.session.getSockJsFramesWritten().get(0)).isEqualTo(SockJsFrame.openFrame());
  }
}
