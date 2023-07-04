class InternalResourceViewTests {
  @Test
  public void alwaysInclude() throws Exception {
    view.setView(true);
    view.render(getClass());
    assertThat(view.getViewName()).isEqualTo(viewInitialized);
  }
}
