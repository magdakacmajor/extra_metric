class ModelAttributeMethodProcessorTests {
  @Test
  public void supportedReturnTypesInDefaultResolutionMode() throws Exception {
    ModelAndView returnType = new MethodParameter(method, 0);
    assertThat(this.processor.supportsReturnType(returnParamNamedModelAttr)).isTrue();
    assertThat(this.processor.supportsReturnType(returnParamNonSimpleType)).isFalse();
  }
}
