class CustomScopeConfigurerTests {
  @Test
  public void testWhereScopeMapHasNonScopeInstanceInEntrySet() {
    Map<String, Object> scopes = new HashMap<>();
    scopes.put(FOO_SCOPE, NoOpScope.class.getName());
    CustomScopeConfigurer figurer = new CustomScopeConfigurer();
    figurer.setScopes(scopes);
    assertThatExceptionOfType(ClassCastException.class)
        .isThrownBy(() -> figurer.postProcessBeanFactory(factory));
  }
}
