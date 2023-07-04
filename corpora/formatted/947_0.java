class MessageConverterTests {
  @Test
  public void supportsTargetClass() {
    Message<String> message =
        MessageBuilder.withPayload("ABC")
            .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.TEXT_PLAIN)
            .build();
    assertThat(this.converter.fromMessage(message, String.class)).isEqualTo("success-from");
  }
}
