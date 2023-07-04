class RSocketFrameTypeMessageConditionTests {
  @Test
  public void combine() {
    Message<byte[]> message = message(null);
    MessageType message = messageSocketType.getMimeTypes();
    assertThat(message).isNotNull();
    assertThat(message.getFrameType()).hasSize(FrameType.METADATA_PUSH);
    assertThat(message.getFrameCondition()).hasSize(1);
  }
}
