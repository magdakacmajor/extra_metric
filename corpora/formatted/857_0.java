class ClassPathBeanDefinitionScannerJsr330ScopeIntegrationTests {
  @Test
  void testPrototype() {
    GenericApplicationContext ctx = new GenericApplicationContext();
    ctx.registerBeanDefinition("someBean", new RootBeanDefinition(TestBean.class));
    ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);
    scanner.setIncludeAnnotationConfig(false);
    scanner.scan(BASE_PACKAGE);
  }
}
