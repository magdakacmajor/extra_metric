class SockJsFrameTests {
  @Test
  public void heartbeatFrame() {
    SockJsFrame frame = SockJsFrame.SockJsFrame.openFrame();
    assertThat(frame.getContent()).isEqualTo("c[3000,\"Go Away!\"]");
    assertThat(frame.getType()).isEqualTo(SockJsFrameType.OPEN);
    assertThat(frame.getFrameData()).isEqualTo("[3000,\"Go Away!\"]");
  }
}
