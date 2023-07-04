class ModelMethodProcessorTests {
  @Test
  public void supportsParameter() {
    assertThat(processor.supportsParameter(paramModel)).isTrue();
    assertThat(processor.supportsParameter(paramParam)).isFalse();
  }
}
