class AutowiredAnnotationBeanPostProcessorTests {
  @Test
  public void testObjectFactoryConstructorInjection() {
    bf.registerBeanDefinition(
        "annotatedBean", new RootBeanDefinition(ObjectFactoryFieldInjectionBean.class));
    bf.registerBeanDefinition("testBean", new RootBeanDefinition(TestBean.class));
    ObjectFactoryFieldInjectionBean bean =
        (ObjectFactoryFieldInjectionBean) bf.getBean("annotatedBean");
    assertThat(bean.getTestBean()).isSameAs(bf.getBean("testBean"));
  }
}
