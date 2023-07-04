class SseEmitterTests {
  @Test
  public void sendEventEmpty() throws Exception {
    this.emitter.send("foo");
    this.handler.assertSentObjectCount(3);
    this.handler.assertObject(0, "data:", TEXT_PLAIN_UTF8);
    this.handler.assertObject(1, "foo");
    this.handler.assertObject(2, "\n\n", TEXT_PLAIN_UTF8);
  }
}
