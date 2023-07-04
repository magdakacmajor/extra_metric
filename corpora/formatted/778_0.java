class JeeNamespaceHandlerTests {
  @Test
  public void testWithReferencedEnvironment() throws Exception {
    BeanDefinition beanDefinition = this.beanFactory.getMergedBeanDefinition("withEnvironment");
    assertPropertyValue(beanDefinition, "jndiEnvironment", "foo=bar");
    assertPropertyValue(beanDefinition, "defaultObject", new RuntimeBeanReference("myBean"));
  }
}
