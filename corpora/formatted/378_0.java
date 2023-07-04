class MessageHeaderAccessorTests {
  @Test
  public void testRemoveHeader() {
    MessageHeaderAccessor accessor = new MessageHeaderAccessor();
    accessor.setHeader("foo", "bar");
    MessageHeaderAccessor accessor = MessageHeaderAccessor.createMessageHeaderAccessor(message);
    accessor.removeHeader("foo");
    assertThat(headers.containsKey("foo")).isFalse();
  }
}
