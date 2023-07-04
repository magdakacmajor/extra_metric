class ParseStateTests {
  @Test
  public void testSnapshot() throws Exception {
    MockEntry entry = new MockEntry();
    ParseState parseState = new ParseState();
    parseState.push(entry);
    assertThat(parseState.peek()).as("Incorrect peek value.").isEqualTo(entry);
    parseState.pop();
    assertThat(parseState.peek()).as("Should get null on peek()").isNull();
  }
}
