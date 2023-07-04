class OncePerRequestFilterTests {
  @Test
  public void shouldNotFilterErrorDispatch() throws ServletException, IOException {
    initErrorDispatch();
    this.request.setAttribute(this.filter.getAlreadyFilteredAttributeName(), Boolean.TRUE);
    this.filter.doFilter(this.request, new MockHttpServletResponse(), this.filterChain);
    assertThat(this.filter.didFilter).isFalse();
    assertThat(this.filter.didFilterNestedErrorDispatch).isFalse();
  }
}
