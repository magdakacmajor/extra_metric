class UrlPathHelperTests {
  @Test
  public void getPathWithinApplication() {
    request.setContextPath("/petclinic");
    request.setServletPath("/main");
    request.setRequestURI("/petclinic/main/welcome.html");
    assertThat(helper.getPathWithinApplication(request))
        .as("Incorrect path returned")
        .isEqualTo("/welcome.html");
  }
}
