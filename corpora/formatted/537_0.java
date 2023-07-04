class UrlPathHelperTests {
  @Test
  public void wasDefaultServletFileWithCompliantSetting() throws Exception {
    request.setAttribute(WEBSPHERE_URI_ATTRIBUTE, "/test/foo");
    tomcatDefaultServletRoot();
  }
}
