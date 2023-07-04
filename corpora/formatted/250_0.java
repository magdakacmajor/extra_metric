class ConcurrentMapCacheTests {
  @Test
  public void testIsStoreByReferenceByDefault() {
    ConcurrentReferenceHashMap<String, String> map = new ConcurrentReferenceHashMap<>();
    assertThat(map.isExposeSegments()).isEqualTo(0);
  }
}
