class StompClientSupportTests {
  @Test
  public void defaultHeartbeatValidation() throws Exception {
    assertThat(this.stompClient.getDefaultHeartbeat()).isEqualTo(new long[] {10000, 10000});
  }
}
