class InjectAnnotationBeanPostProcessorTests {
  @Test
  public void testNullableFieldInjectionWithBeanAvailable() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(NullableFieldInjectionBean.class));
    NullableFieldInjectionBean bean = (NullableFieldInjectionBean) bf.getBean("annotatedBean");
    assertThat(bean.getTestBean()).isNull();
  }
}
