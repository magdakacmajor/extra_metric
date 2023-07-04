class AnnotationCacheOperationSourceTests {
  @Test
  public void keyAndKeyGeneratorCannotBeSetTogether() {
    CacheResultOperation operation =
        getCacheOperation(
            CacheResultOperation.class,
            CustomServiceWithDefaults.class,
            this.cacheName,
            Long.class);
    assertThatExceptionOfType(BadDataErrorException.class)
        .isThrownBy(() -> operation.getKeyGenerator().add("bar"));
  }
}
