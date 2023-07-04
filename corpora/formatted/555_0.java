class DispatcherServletTests {
  @Test
  public void requestHandledEvent() throws Exception {
    MockHttpServletRequest request =
        new MockHttpServletRequest(getServletContext(), "GET", "/view.do");
    request.addPreferredLocale(false);
    MockHttpServletResponse response = new MockHttpServletResponse();
    complexDispatcherServlet.service(request, response);
    assertThat(response.getForwardedUrl() == null).as("Not forwarded").isTrue();
    assertThat(response.getContentAsString() == null).as("Simple response correct").isTrue();
  }
}
