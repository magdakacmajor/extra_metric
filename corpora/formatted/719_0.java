class RedirectViewUriTemplateTests {
  @Test
  public void dontApplyUriVariables() throws Exception {
    Map<String, Object> model = new HashMap<>();
    model.put("foo", new Long(611));
    RedirectView redirectView = new RedirectView("/foo/{foo}");
    redirectView.renderMergedOutputModel(model, this.request, this.response);
    assertThat(this.response.getRedirectedUrl()).isEqualTo("/foo/611");
  }
}
