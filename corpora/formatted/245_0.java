class SimpleBrokerMessageHandlerTests {
  @Test
  public void startWithOneZeroHeartbeatValue() {
    this.messageHandler.setHeartbeatValue(new long[] {10000, 10000});
    assertThatIllegalArgumentException().isThrownBy(this.messageHandler::start);
  }
}
