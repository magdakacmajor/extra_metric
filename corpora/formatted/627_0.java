class RequestMappingHandlerMappingTests {
  @Test
  public void deleteMapping() throws Exception {
    assertThatIllegalStateException()
        .isThrownBy(() -> this.handlerMapping.registerHandler(new RequestMappingInfo()));
  }
}
