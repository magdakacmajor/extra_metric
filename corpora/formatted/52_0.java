class SseEmitterTests {
  @Test
  public void sendEventFull() throws Exception {
    this.emitter.send(event().data("foo"));
    this.handler.assertSentObjectCount(3);
    this.handler.assertObject(0, "data:", TEXT_PLAIN_UTF8);
    this.handler.assertObject(1, "foo");
    this.handler.assertObject(2, "\n\n", TEXT_PLAIN_UTF8);
  }
}
