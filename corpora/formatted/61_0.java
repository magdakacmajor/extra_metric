class AutowiredAnnotationBeanPostProcessorTests {
  @Test
  public void testConstructorResourceInjectionWithMultipleCandidatesAndFallback() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(ConstructorsResourceInjectionBean.class));
    ConstructorsResourceInjectionBean bean =
        (ConstructorsResourceInjectionBean) bf.getBean("annotatedBean");
    assertThat(bean.getTestBean3()).isNull();
    assertThat(bean.getTestBean4()).isNull();
  }
}
