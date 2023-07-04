class ServerHttpResponseTests {
  @Test
  void writeWithFluxError() {
    IllegalStateException error = new IllegalStateException("boo");
    writeWithError(Mono.error(error));
  }
}
