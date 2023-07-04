class UrlTagTests {
  @Test
  public void createUrlRemoteContextSingleSlash() throws JspException {
    tag.setValue("url/path");
    tag.doStartTag();
    String uri = tag.createUrl();
    assertThat(uri).isEqualTo("/app-context/url/path");
  }
}
