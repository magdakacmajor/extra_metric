class GroovyMarkupViewTests {
  @Test
  public void missingGroovyMarkupConfig() throws Exception {
    assertThat(this.view.isGroovyAs("missing")).isFalse();
    assertThat(resolver.checkResource(Locale.US)).isFalse();
  }
}
