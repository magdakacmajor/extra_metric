class SockJsClientTests {
  @Test
  public void connectSockJsInfoCached() throws Exception {
    setupInfoRequest(true);
    this.sockJsClient.doHandshake(handler, URL);
    verify(this.infoReceiver, times(1)).executeInfoRequest(any(), any());
  }
}
