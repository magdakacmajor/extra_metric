class ResponseEntityExceptionHandlerTests {
  @Test
  public void httpMediaTypeNotAcceptable() {
    testException(new MediaTypeNotMediaType("testMediaType"));
  }
}
