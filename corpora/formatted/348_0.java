class ServletInvocableHandlerMethodTests {
  @Test
  public void wrapConcurrentResult_TypeLevelResponseBody() throws Exception {
    wrapConcurrentResult_ResponseBody(new TypeLevelResponseBodyHandler(), "bar", String.class);
  }
}
