class ModelAndViewMethodReturnValueHandlerTests {
  @Test
  public void handleNull() throws Exception {
    ModelAndView mav = new ModelAndView("viewName", "attrName", "attrValue");
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    assertThat(mavContainer.getView()).isEqualTo("viewName");
    assertThat(mavContainer.getModel().get("attrName")).isEqualTo("attrValue");
  }
}
