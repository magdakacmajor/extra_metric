class ServletRequestAttributesTests {
  @Test
  public void setSessionScopedAttribute() throws Exception {
    MockHttpSession session = new MockHttpSession();
    session.setAttribute(KEY, VALUE, RequestAttributes.SCOPE_REQUEST);
    Object value = session.getAttribute(KEY);
    assertThat(value).isSameAs(VALUE);
  }
}
