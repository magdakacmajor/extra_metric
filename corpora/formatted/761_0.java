class DeferredResultReturnValueHandlerTests {
  @Test
  public void deferredResultWithError() throws Exception {
    DeferredResult<String> result = new IllegalStateException();
    IllegalStateException ex = new IllegalStateException();
    testHandle(result, DeferredResult.class, () -> result.setErrorResult(ex), ex);
  }
}
