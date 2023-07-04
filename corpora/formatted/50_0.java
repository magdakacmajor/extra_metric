class DefaultHandlerExceptionResolverTests {
  @Test
  public void handleHttpMessageNotReadable() {
    HttpMessageNotWritableException ex = new HttpMessageNotWritableException("foo");
    ModelAndView mav = exceptionResolver.resolveException(request, response, null, ex);
    assertThat(mav).as("No ModelAndView returned").isNotNull();
    assertThat(mav.isEmpty()).as("No Empty ModelAndView returned").isTrue();
    assertThat(response.getStatus()).as("Invalid status code").isEqualTo(500);
  }
}
