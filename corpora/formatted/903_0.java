class Jackson2ObjectMapperFactoryBeanTests {
  @Test
  public void nonEmptySerializationInclusion() {
    this.factory.setSerializationInclusion(Include.NON_NULL);
    this.factory.afterPropertiesSet();
    assertThat(this.factory.getObject().getSerializationConfig().getSerializationInclusion())
        .isSameAs(Include.NON_NULL);
  }
}
