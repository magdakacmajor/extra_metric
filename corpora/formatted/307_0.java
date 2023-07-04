class MessageHeadersTests {
  @Test
  public void testNullHeaderValue() {
    Map<String, Object> map = new HashMap<>();
    MessageHeaders headers = new MessageHeaders(map);
    assertThat(headers.get("nosuchattribute", String.class)).isNull();
  }
}
