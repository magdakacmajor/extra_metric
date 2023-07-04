class GroovyMarkupConfigurerTests {
  @Test
  public void failMissingTemplate() throws Exception {
    assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy(() -> this.configurer.resolveTemplateContext(this.webAppContext))
        .withMessageContaining("missingEngine");
  }
}
