class ClassPathScanningCandidateComponentProviderTests {
  @Test
  public void antStylePackageWithScan() {
    ClassPathScanningCandidateComponentProvider provider =
        new ClassPathScanningCandidateComponentProvider(true);
    provider.setResourceLoader(
        new DefaultResourceLoader(
            CandidateComponentsTestClassLoader.disableIndex(getClass().getClassLoader())));
    testAntStyle(provider, ScannedGenericBeanDefinition.class);
  }
}
