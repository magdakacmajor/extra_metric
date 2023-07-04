class ServletRequestAttributesTests {
  @Test
  public void getSessionScopedAttributeDoesNotForceCreationOfSession() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    ServletRequestAttributes attrs = new ServletRequestAttributes(request);
    attrs.setAttribute(KEY, RequestAttributes.SCOPE_SESSION);
    verify(request).getSession(false);
  }
}
