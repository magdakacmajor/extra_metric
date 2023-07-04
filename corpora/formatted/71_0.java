class HibernateNativeEntityManagerFactorySpringBeanContainerIntegrationTests {
  @Test
  public void testFallbackExceptionInCaseOfNoSpringBeanFound() {
    assertThatExceptionOfType(UnsupportedOperationException.class)
        .isThrownBy(
            () ->
                getBeanContainer()
                    .getBean(
                        "some name",
                        NoDefinitionInSpringContextTestBean.class,
                        NativeLifecycleOptions.INSTANCE,
                        IneffectiveBeanInstanceProducer.INSTANCE));
  }
}
