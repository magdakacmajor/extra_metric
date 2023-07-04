class MetadataEncoderTests {
  @Test
  public void metadataWithTextPlainMimeType() {
    DataBuffer buffer =
        new MetadataEncoder(MimeTypeUtils.TEXT_PLAIN, this.strategies)
            .metadata("toA")
            .encode()
            .block();
    assertThat(dumpString(buffer)).isEqualTo("toA");
  }
}
