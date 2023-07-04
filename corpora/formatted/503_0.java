class TagWriterTests {
  @Test
  public void blockTagWithAttributes() throws Exception {
    this.writer.startTag("span");
    this.writer.appendValue("foobar");
    this.writer.endTag();
    assertThat(this.data.toString()).isEqualTo("<span>Rob Harrop</span>");
  }
}
