class RequestResponseBodyMethodProcessorMockTests {
  @Test
  public void supportsParameter() {
    assertThat(processor.supportsReturnType(returnTypeString))
        .as("ResponseBody return type not supported")
        .isTrue();
    assertThat(processor.supportsParameter(paramStringNotRequired))
        .as("non-ResponseBody return type supported")
        .isFalse();
  }
}
