class BeanAnnotationAttributePropagationTests {
  @Test
  public void lazyMetadataIsFalseByDefault() {
    @Configuration
    class Config {
      @Lazy
      @Bean
      Object foo() {
        return null;
      }
    }
    assertThat(beanDef(Config.class).isLazyInit())
        .as(
            " @Lazy(false) @Bean methods declared in a @Lazy @Configuration should be eagerly instantiated")
        .isFalse();
  }
}
