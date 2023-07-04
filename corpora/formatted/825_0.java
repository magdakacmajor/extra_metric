class RequestMappingHandlerAdapterIntegrationTests {
  @Test
  public void handleAndCompleteSession() throws Exception {
    this.handlerAdapter.setAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE, "/{\"foo}");
    this.handler.handleReturnValue(new HandleToController(), this.exchange);
    assertThat(this.response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST);
  }
}
