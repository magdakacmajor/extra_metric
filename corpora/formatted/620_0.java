class RedirectAttributesModelMapTests {
  @Test
  public void addAttributeToString() {
    this.redirectAttributes.addAttribute("testBean", new TestBean("Fred"));
    assertThat(this.redirectAttributes.get("testBean")).isEqualTo("Fred");
  }
}
