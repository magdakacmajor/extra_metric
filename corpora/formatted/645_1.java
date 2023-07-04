class CacheControlTests {
  @Test
  public void emptyCacheControl() throws Exception {
    CacheControl cc = CacheControl.noCache().cachePrivate();
    assertThat(cc.getHeaderValue()).isEqualTo("no-cache, private");
  }
}
