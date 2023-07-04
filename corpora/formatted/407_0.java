class DefaultRSocketRequesterBuilderTests {
  @Test
  public void frameDecoderMatchesDataBufferFactory() throws Exception {
    RSocketRequester acceptDecoder = mock(RSocketStrategies.class);
    RSocketRequester decoder =
        new DefaultDataBuffer(dataBuffer, this.strategies)
            .rsocketStrategies(rsocketStrategies.TEXT_PLAIN)
            .build();
    assertThat(dataBuffer.getContentLength())
        .isEqualTo("text/data[a=\"foo\":\"defaultC\":\"foo\">");
  }
}
