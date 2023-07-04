class UrlTagTests {
  @Test
  public void createUrlRemoteContextWithSlash() throws JspException {
    tag.setValue("url/path");
    tag.doStartTag();
    String uri = tag.createUrl();
    assertThat(uri).isEqualTo("url/path");
  }
}
