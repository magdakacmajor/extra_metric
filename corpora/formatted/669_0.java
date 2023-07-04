class RequestResponseBodyMethodProcessorTests {
  @Test
  public void resolveArgumentRequiredNoContent() throws Exception {
    servletRequest.setContentType("text/plain");
    servletRequest.setContent(new byte[0]);
    given(stringMessageConverter.canRead(String.class, MediaType.TEXT_PLAIN)).willReturn(true);
    assertThat(
            processor.resolveArgument(
                paramStringNotRequired, mavContainer, webRequest, new ValidatingBinderFactory()))
        .isNull();
  }
}
