class WebSocketStompClientTests {
  @Test
  public void readInactivityBeforeDelayHasElapsed() throws Exception {
    TcpConnection<byte[]> tcpConnection = getTcpConnection();
    Runnable runnable = mock(Runnable.class);
    long delay = 1000;
    tcpConnection.onReadInactivity(runnable, delay);
    testInactivityTaskScheduling(runnable, delay, 10);
  }
}
