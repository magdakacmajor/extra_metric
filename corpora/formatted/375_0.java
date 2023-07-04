class ClassPathScanningCandidateComponentProviderTests {
  @Test
  public void testIntegrationWithAnnotationConfigApplicationContext_validProfile() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.getEnvironment().setActiveProfiles(DevComponent.PROFILE_NAME);
    ctx.register(ProfileAnnotatedComponent.class);
    ctx.refresh();
    assertThat(ctx.containsBean(ProfileAnnotatedComponent.BEAN_NAME)).isTrue();
  }
}
