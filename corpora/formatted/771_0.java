class WebJarsResourceResolverTests {
  @Test
  public void resolveUrlExisting() {
    String file = "something/something.js";
    given(this.chain.resolveUrlPath(file, this.locations)).willReturn(null);
    String actual = this.resolver.resolveUrlPath(file, this.locations, this.chain);
    assertThat(actual).isNull();
    verify(this.chain, times(1)).resolveUrlPath(file, this.locations);
    verify(this.chain, never()).resolveUrlPath(null, this.locations);
  }
}
