class UtilNamespaceHandlerTests {
  @Test
  public void testConstantWithDefaultName() {
    TestBean bean = (TestBean) this.beanFactory.getBean("testBean");
    assertThat(bean.getName()).isEqualTo("Rob Harrop");
  }
}
