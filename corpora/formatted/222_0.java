class PasswordInputTagTests {
  @Test
  public void dynamicTypeAttribute() throws JspException {
    this.tag.setPath("myFloat");
    this.tag.setDynamicAttribute(null, "type", "number");
    assertThat(this.tag.doStartTag()).isEqualTo(Tag.SKIP_BODY);
    String output = getOutput();
    assertTagOpened(output);
    assertTagClosed(output);
    assertContainsAttribute(output, "type", getType());
    assertValueAttribute(output, "12.34");
  }
}
