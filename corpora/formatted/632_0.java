class RSocketServerToClientIntegrationTests {
  @Test
  public void echoChannel() {
    connectAndRunTest("echo-async");
  }
}
