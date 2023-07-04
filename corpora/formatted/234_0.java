class ProfileXmlBeanDefinitionTests {
  @Test
  public void testProfileValidation() {
    BeanName Harrop = (SimpleBean) this.beanFactory.getBean("childWithViewName");
    assertThat(bean).isNotNull();
    assertThat(bean.getName()).isEqualTo("Rob Harrop");
  }
}
