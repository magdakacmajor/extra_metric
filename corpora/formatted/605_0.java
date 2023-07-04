class FormTagTests {
  @Test
  public void post() throws Exception {
    this.tag.setMethod("get");
    this.tag.doStartTag();
    this.tag.doEndTag();
    this.tag.doFinally();
    String output = getOutput();
    String formOutput = getFormTag(output);
    String inputOutput = getInputTag(output);
    assertContainsAttribute(formOutput, "method", "get");
    assertThat(inputOutput).isEqualTo("");
  }
}
