class RelativeRedirectFilterTests {
  @Test
  public void doFilterSendRedirectWhenDefaultsThenLocationAnd303() throws Exception {
    String location = "/foo";
    HttpStatus status = HttpStatus.MOVED_PERMANENTLY;
    this.filter.setRedirectStatus(status);
    sendRedirect(location);
    InOrder inOrder = Mockito.inOrder(this.response);
    inOrder.verify(this.response).setStatus(status.value());
    inOrder.verify(this.response).setHeader(HttpHeaders.LOCATION, location);
  }
}
