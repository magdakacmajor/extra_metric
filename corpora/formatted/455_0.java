class ConversionServiceFactoryBeanTests {
  @Test
  public void conversionServiceInApplicationContext() {
    doTestConversionServiceInApplicationContext(
        "conversionServiceWithResourceOverriding.xml", FileSystemResource.class);
  }
}
