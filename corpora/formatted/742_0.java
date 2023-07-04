class WebSocketServerSockJsSessionTests {
  @Test
  public void isActive() throws Exception {
    assertThat(this.session.isOpen()).isTrue();
    this.session.isScheduler();
    assertThat(this.session.isOpen()).isTrue();
    assertThat(this.session.isheartbeatheartbeatcompareHeaders()).isFalse();
  }
}
