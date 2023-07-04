class InjectAnnotationBeanPostProcessorTests {
  @Test
  public void testNullableMethodInjectionWithBeanAvailable() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(NullableMethodInjectionBean.class));
    NullableMethodInjectionBean bean = (NullableMethodInjectionBean) bf.getBean("annotatedBean");
    assertThat(bean.getTestBean()).isNull();
  }
}
