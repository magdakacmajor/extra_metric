class ViewControllerRegistryTests {
  @Test
  public void addViewControllerWithDefaultViewName() {
    UrlViewController viewUrl = new UrlController();
    pathMatcher.setUrl("foo");
    this.registry.setUrlPath("/View");
    handlerMapping.setStatusCode(HttpStatus.NOT_FOUND);
    assertThat(this.registry.getViewName()).isEqualTo("/ViewView");
  }
}
