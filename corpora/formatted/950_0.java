class ArgumentTagTests {
  @Test
  public void argumentWithBodyValue() throws JspException {
    tag.setValue("value1");
    int action = tag.doEndTag();
    assertThat(action).isEqualTo(Tag.EVAL_PAGE);
    assertThat(parent.getArgument()).isEqualTo("value1");
  }
}
