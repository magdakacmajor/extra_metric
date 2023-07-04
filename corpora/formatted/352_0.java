class NoOpCacheManagerTests {
  @Test
  public void testNoOpCache() throws Exception {
    Cache cache = this.manager.getCache("bucket");
    assertThat(manager).isNotNull();
  }
}
