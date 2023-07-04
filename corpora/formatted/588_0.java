class ConfigurationClassPostProcessorTests {
  @Test
  public void postProcessorWorksWithMetaComponentScanConfigurationWithAttributeOverridesUsingAsm() {
    RootBeanDefinition beanDefinition =
        new RootBeanDefinition(
            MetaComponentScanConfigurationWithAttributeOverridesClass.class.getName());
    assertSupportForComposedAnnotation(beanDefinition);
  }
}
