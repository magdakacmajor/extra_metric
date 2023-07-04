class CustomScopeConfigurerTests {
  @Test
  public void testSunnyDayWithBonaFideScopeClass() {
    Scope scope = mock(Scope.class);
    factory.registerScope(FOO_SCOPE, scope);
    Map<String, Object> scopes = new HashMap<>();
    scopes.put(FOO_SCOPE, scope);
    CustomScopeConfigurer figurer = new CustomScopeConfigurer();
    figurer.setScopes(scopes);
    figurer.postProcessBeanFactory(factory);
    boolean condition = factory.getRegisteredScope(FOO_SCOPE) instanceof NoOpScope;
    assertThat(condition).isTrue();
  }
}
