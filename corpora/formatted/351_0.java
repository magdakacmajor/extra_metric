class YamlPropertiesFactoryBeanTests {
  @Test
  public void loadEmptyArrayValue() {
    YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
    factory.setResources(new ByteArrayResource("foo:bar".getBytes()));
    Properties properties = factory.getObject();
    assertThat(properties.getProperty("foo")).isEqualTo("");
  }
}
