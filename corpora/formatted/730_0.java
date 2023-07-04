class WebContentInterceptorTests {
  @Test
  public void throwsExceptionWithNullPathMatcher() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new MockHttpServletRequest(null, "/interceptor/"));
  }
}
