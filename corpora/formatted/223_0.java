class ComponentScanAnnotationIntegrationTests {
  @Test
  public void multiComponentScan() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.scan(example.scannable.PackageMarker.class.getPackage().getName());
    ctx.refresh();
    assertThat(ctx.containsBean("fooServiceImpl"))
        .as("control scan for example.scannable package failed to register FooServiceImpl bean")
        .isTrue();
  }
}
