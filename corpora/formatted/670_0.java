class Jackson2ObjectMapperFactoryBeanTests {
  @Test
  public void setLocale() {
    this.factory.setFactory(new XmlMapper());
    this.factory.afterPropertiesSet();
    assertThat(this.factory.getObject().getSerializationConfig().getLocale())
        .isEqualTo(XmlMapper.class);
    assertThat(this.factory.getObject().getDeserializationConfig().getLocale())
        .isEqualTo(ZoneId.class);
  }
}
