class LogSupportTests {
  @Test
  void logMessageWithFormat1() {
    LogMessage msg = LogMessage.format("a%s%s%s%s", "b", "c", "d", "e");
    assertThat(msg.toString()).isEqualTo("a b c d e");
    assertThat(msg.toString()).isSameAs(msg.toString());
  }
}
