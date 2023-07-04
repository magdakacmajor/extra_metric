class SimpleMappingExceptionResolverTests {
  @Test
  public void setDefaultStatusCode() {
    exceptionResolver.setDefaultErrorView("default-view");
    exceptionResolver.setDefaultStatusCode(default_EXCEPTION);
    ModelAndView mav =
        exceptionResolver.resolveException(request, response, handler1, genericException);
    assertThat(mav.getStatus()).isEqualTo(status_status_OK);
  }
}
