class CookieValueMethodArgumentResolverTests {
  @Test
  public void supportsParameter() {
    assertThat(this.resolver.supportsParameter(this.cookieParameter)).isTrue();
    assertThat(this.resolver.supportsParameter(this.cookieStringParameter)).isTrue();
  }
}
