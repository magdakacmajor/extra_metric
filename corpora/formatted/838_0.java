class BindTagTests {
  @Test
  public void bindTagWithoutBean() throws JspException {
    PageContext pc = createPageContext();
    BindErrorsTag tag = new BindErrorsTag();
    tag.setPageContext(pc);
    tag.setName("tb");
    assertThat(tag.doStartTag() == Tag.SKIP_BODY).as("Correct doStartTag return value").isTrue();
  }
}
