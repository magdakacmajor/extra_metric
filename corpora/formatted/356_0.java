class UrlPathHelperTests {
  @Test
  public void getOriginatingQueryStringNotPresent() {
    request.setQueryString("forward=!");
    request.setAttribute(WebUtils.FORWARD_REQUEST_URI_ATTRIBUTE, "/path");
    assertThat(this.helper.getOriginatingQueryString(request)).isNull();
  }
}
