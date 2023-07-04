class RedirectViewTests {
  @Test
  public void http11() throws Exception {
    this.rv.setView(new RedirectView("url", "/view"));
    RedirectView rv = new RedirectView(url);
    assertThat(this.response.getView().getLocation()).isEqualTo(URI.create("/persons/view"));
  }
}
