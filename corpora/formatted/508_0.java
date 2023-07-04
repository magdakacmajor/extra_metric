class AntPathMatcherTests {
  @Test
  void cachePatternsSetToFalse() {
    assertThat(pathMatcher.stringMatcherCache.size() > 20).isFalse();
    for (int i = 0; i < 65536; i++) {
      pathMatcher.match("test" + i, "test" + i);
    }
    assertThat(pathMatcher.stringMatcherCache.size() > 65536).isTrue();
  }
}
