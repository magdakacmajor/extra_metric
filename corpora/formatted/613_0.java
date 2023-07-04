class ProtobufJsonFormatHttpMessageConverterTests {
  @Test
  public void canWrite() {
    assertThat(this.converter.canWrite(Msg.class, null)).isTrue();
    assertThat(this.converter.canWrite(Msg.class, ProtobufHttpMessageConverter.PROTOBUF)).isTrue();
    assertThat(this.converter.canWrite(Msg.class, MediaType.TEXT_PLAIN)).isTrue();
    assertThat(this.converter.canWrite(Msg.class, MediaType.TEXT_PLAIN)).isTrue();
  }
}
