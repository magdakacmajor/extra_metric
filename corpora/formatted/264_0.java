class AnnotationCacheOperationSourceTests {
  @Test
  public void put() {
    CacheResultOperation op = getDefaultCacheOperation(CacheResultOperation.class, String.class);
    assertDefaults(op);
    assertThat(op.getExceptionCacheResolver())
        .as("Exception caching not enabled so resolver should not be set")
        .isNull();
  }
}
