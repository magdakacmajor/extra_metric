class StompClientSupportTests {
  @Test
  public void processConnectHeadersDefault() throws Exception {
    StompHeaders connectHeaders = new StompHeaders();
    connectHeaders.setHeartbeat(new long[] {15000, 15000});
    connectHeaders = this.stompClient.processConnectHeaders(connectHeaders);
    assertThat(connectHeaders).isNotNull();
    assertThat(connectHeaders.getHeartbeat()).isEqualTo(new long[] {15000, 15000});
  }
}
