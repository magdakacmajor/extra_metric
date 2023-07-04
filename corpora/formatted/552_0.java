class YamlPropertiesFactoryBeanTests {
  @Test
  public void badResource() {
    YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
    factory.setResources(new ByteArrayResource("foo:bar\n spam:\n foo:baz".getBytes()));
    Properties properties = factory.getObject();
    assertThat(properties.getProperty("foo")).isEqualTo("bar");
    assertThat(properties.getProperty("spam")).isEqualTo("baz");
  }
}
