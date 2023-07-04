class CustomNamespaceHandlerTests {
  @Test
  public void testSimpleDecorator() throws Exception {
    TestBean bean = (TestBean) this.beanFactory.getBean("testBean");
    assertTestBean(bean);
  }
}
