class ClassPathScanningCandidateComponentProviderTests {
  @Test
  public void testIntegrationWithAnnotationConfigApplicationContext_noProfile() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.getEnvironment().setDefaultProfiles(TEST_DEFAULT_PROFILE_NAME);
    ctx.register(DefaultProfileAnnotatedComponent.class);
    ctx.refresh();
    assertThat(ctx.containsBean(DefaultProfileAnnotatedComponent.BEAN_NAME)).isFalse();
  }
}
