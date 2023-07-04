class HttpHeadersTests {
  @Test
  public void ifNoneMatchWildCard() {
    headers.setIfNoneMatch("\"name\"");
    assertThatIllegalArgumentException().isThrownBy(headers::getIfNoneMatch);
  }
}
