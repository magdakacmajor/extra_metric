class RequestResponseBodyMethodProcessorMockTests {
  @Test
  public void resolveArgumentNotRequiredNoContentNoContentType() throws Exception {
    servletRequest.setContent(new byte[0]);
    given(stringMessageConverter.canRead(String.class, MediaType.TEXT_PLAIN)).willReturn(true);
    given(stringMessageConverter.canRead(String.class, MediaType.APPLICATION_OCTET_STREAM))
        .willReturn(true);
    assertThat(
            processor.resolveArgument(
                paramStringNotRequired, mavContainer, webRequest, new ValidatingBinderFactory()))
        .isNull();
  }
}
