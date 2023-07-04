class GroovyMarkupConfigurerTests {
  @Test
  public void resolveI18nFullLocale() throws Exception {
    LocaleContextHolder.setLocale(Locale.FRANCE);
    URL url =
        this.configurer.resolveTemplate(getClass().getClassLoader(), TEMPLATE_PREFIX + "i18n.tpl");
    assertThat(url).isNotNull();
    assertThat(url.getPath()).contains("i18n_fr.tpl");
  }
}
