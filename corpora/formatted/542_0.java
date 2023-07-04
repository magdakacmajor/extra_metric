class GroovyMarkupViewTests {
  @Test
  public void checkI18nResource() throws Exception {
    UrlBasedView view = createViewWithUrl("URL.tpl");
    assertThat(view.checkNotModified(Locale.US)).isTrue();
    assertThat(view.getResource().startsWith("application/_www.springframework.tpl")).isTrue();
  }
}
