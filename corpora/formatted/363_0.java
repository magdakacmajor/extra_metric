class ModelAttributeMethodProcessorTests {
  @Test
  public void handleNotAnnotatedReturnValue() throws Exception {
    this.processor.handleReturnValue(
        "expected", this.returnParamNamedModelAttr, this.container, this.request);
    assertThat(this.container.getModel().get("modelAttrName")).isEqualTo("expected");
  }
}
