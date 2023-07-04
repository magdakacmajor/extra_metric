class GroovyMarkupViewTests {
  @Test
  public void renderMarkupTemplate() throws Exception {
    Map<String, Object> model = new HashMap<>();
    MockHttpServletResponse response = renderViewWithModel("content.tpl", model, Locale.US);
    assertThat(response.getContentAsString())
        .isEqualTo(
            "<html><head><title>Layout example</title></head><body><p>This is the body</p></body></html>");
  }
}
