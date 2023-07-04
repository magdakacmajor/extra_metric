class MessageHeadersTests {
  @Test
  public void testHeaderKeys() {
    MessageHeaders headers = new MessageHeaders(null, MessageHeaders.ID_VALUE_NONE, "test/foo");
    assertThat(headers.getMessageHeaders()).isNotNull();
  }
}
