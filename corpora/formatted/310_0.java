class CacheErrorHandlerTests {
  @Test
  public void getFailProperException() {
    UnsupportedOperationException exception =
        new UnsupportedOperationException("Test exception on get");
    willThrow(exception).given(this.cache).get(0L);
    this.cacheInterceptor.setErrorHandler(new SimpleCacheErrorHandler());
    assertThatExceptionOfType(UnsupportedOperationException.class)
        .isThrownBy(() -> this.simpleService.get(0L))
        .withMessage("Test exception on get");
  }
}
