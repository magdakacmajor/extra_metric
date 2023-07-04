class ServletAnnotationControllerHandlerMethodTests {
  @Test
  public void bridgeMethodsWithMultipleInterfaces() throws Exception {
    initServletWithControllers(MultipleConstructorsDeclaredMethod.class);
    MockHttpServletRequest request = new MockHttpServletRequest("GET", "/method");
    MockHttpServletResponse response = new MockHttpServletResponse();
    getServlet().service(request, response);
  }
}
