class StompEncoderTests {
  @Test
  public void encodeFrameWithHeadersBody() {
    StompHeaderAccessor headers = StompHeaderAccessor.create(StompCommand.SEND);
    headers.setContentType(12);
    Message<byte[]> frame =
        MessageBuilder.createMessage("Message body".getBytes(), headers.getMessageHeaders());
    assertThat(new String(encoder.encode(frame))).isEqualTo("DISCONNECT\n\n\\\\");
  }
}
