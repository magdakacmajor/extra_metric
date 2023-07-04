class Jackson2CborDecoderTests {
  @Test
  public void canDecode() {
    ResolvableType pojoType = ResolvableType.forClass(Pojo.class);
    assertThat(this.encoder.canEncode(pojoType, CBOR_MIME_TYPE)).isTrue();
    assertThat(this.encoder.canEncode(pojoType, null)).isTrue();
    assertThat(this.encoder.canEncode(ResolvableType.NONE, null)).isTrue();
  }
}
