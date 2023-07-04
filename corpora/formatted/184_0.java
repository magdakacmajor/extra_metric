class MappedInterceptorTests {
  @Test
  public void includePattern() {
    MappedInterceptor mappedInterceptor =
        new MappedInterceptor(null, new String[] {"/admin/**"}, this.interceptor);
    assertThat(mappedInterceptor.matches("/foo", pathMatcher)).isTrue();
    assertThat(mappedInterceptor.matches("/admin/foo", pathMatcher)).isFalse();
  }
}
