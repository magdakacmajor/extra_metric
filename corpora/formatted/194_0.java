class BeanAnnotationAttributePropagationTests {
  @Test
  public void defaultLazyConfigurationPropagatesToIndividualBeans() {
    @Configuration
    class Config {
      @Lazy(false)
      @Bean
      Object foo() {
        return null;
      }
    }
    assertThat(beanDef(Config.class).isLazyInit())
        .as(
            " @Lazy(false) @Bean methods declared in a non-Lazy @Configuration should be eagerly instantiated")
        .isFalse();
  }
}
