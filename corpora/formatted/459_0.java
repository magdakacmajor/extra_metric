class CachingResourceResolverTests {
  @Test
  public void resolverUrlPathFromCache() {
    String expected = "/foo.css";
    String actual = this.chain.resolveUrlPath(expected, this.locations).block(TIMEOUT);
    assertThat(actual).isEqualTo(expected);
  }
}
