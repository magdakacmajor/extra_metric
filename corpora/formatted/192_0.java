class UrlTagTests {
  @Test
  public void createUrlRemoteContext() throws JspException {
    ((MockHttpServletRequest) context.getRequest()).setContextPath("/app-context");
    tag.setValue("/url/path");
    tag.doStartTag();
    String uri = tag.createUrl();
    assertThat(uri).isEqualTo("/app-context/url/path");
  }
}
