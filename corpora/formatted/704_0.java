class SimpleMappingExceptionResolverTests {
  @Test
  public void nullExceptionAttribute() {
    exceptionResolver.setExceptionMappings(null);
    exceptionResolver.setDefaultErrorView("default-view");
    ModelAndView mav =
        exceptionResolver.resolveException(request, response, handler1, genericException);
    assertThat(mav.getViewName()).isEqualTo("default-view");
  }
}
