class AutowiredAnnotationBeanPostProcessorTests {
  @Test
  public void testSingleConstructorInjectionWithNullDependency() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(SingleConstructorOptionalCollectionBean.class));
    assertThatExceptionOfType(UnsatisfiedDependencyException.class)
        .isThrownBy(() -> bf.getBean("annotatedBean"));
  }
}
