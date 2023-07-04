class ConfigurationClassPostProcessorTests {
  @Test
  public void
      postProcessorWorksWithExtendedConfigurationWithAttributeOverrideForExcludesFilterUsingAsm() {
    RootBeanDefinition beanDefinition =
        new RootBeanDefinition(ExtendedConfigurationWithAttributeOverrideForExcludeFilter.class);
    assertSupportForComposedAnnotationWithExclude(beanDefinition);
  }
}
