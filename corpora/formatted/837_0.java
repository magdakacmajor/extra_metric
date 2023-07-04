class SockJsServiceTests {
  @Test
  public void handleInfoGetCorsFilter() {
    this.servletRequest.setHeader("If-None-Match", "\"00 96 cbd37f2a5218c33bb0826a7c74cbf\"");
    resetResponseAndHandleRequest("GET", "/echo/iframe.html", HttpStatus.NOT_MODIFIED);
  }
}
