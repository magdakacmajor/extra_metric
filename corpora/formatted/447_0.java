class MessageHeaderAccessorTests {
  @Test
  public void timestampDefaultBehavior() {
    MessageHeaderAccessor accessor = new MessageHeaderAccessor();
    assertThat(accessor.getMessageHeaders().getTimestamp()).isNotNull();
  }
}
