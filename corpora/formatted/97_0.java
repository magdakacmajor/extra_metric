class AutowiredAnnotationBeanPostProcessorTests {
  @Test
  public void testAnnotatedDefaultConstructor() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(ObjectFactoryFieldInjectionBean.class));
    bf.registerBeanDefinition("testBean", new RootBeanDefinition(TestBean.class));
    assertThatExceptionOfType(BeanCreationException.class)
        .isThrownBy(() -> bf.getBean("annotatedBean"))
        .withRootCauseInstanceOf(IllegalStateException.class);
  }
}
