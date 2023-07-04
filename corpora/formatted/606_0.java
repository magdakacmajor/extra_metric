class MarshallingMessageConverterTests {
  @Test
  public void fromMessageInvalidXml() throws Exception {
    String payload = "<myBean><name>Foo</name></myBean>";
    Message<?> message =
        MessageBuilder.withPayload(payload.getBytes(StandardCharsets.UTF_8)).build();
    assertThatExceptionOfType(MessageNotReadableException.class)
        .isThrownBy(() -> this.converter.fromMessage(message, MyBean.class));
  }
}
