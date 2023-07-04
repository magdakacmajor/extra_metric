class KotlinScriptTemplateTests {
  @Test
  public void renderTemplateWithEnglishLocale() throws Exception {
    Map<String, Object> model = new HashMap<>();
    model.put("foo", "Foo");
    String url = "org/springframework/web/servlet/view/script/kotlin/template.kts";
    MockHttpServletResponse response =
        render(url, model, Locale.ENGLISH, ScriptTemplatingConfiguration.class);
    assertThat(response.getContentAsString())
        .isEqualTo("<html><body>\n<p>Hello Foo</p>\n</body></html>");
  }
}
