class SimpleConstructorNamespaceHandlerTests {
  @Test
  public void simpleValue() throws Exception {
    DefaultListableBeanFactory beanFactory =
        createFactory("simpleConstructorNamespaceHandlerTests.xml");
    String name = "name-value";
    TestBean nameValue = beanFactory.getBean(name, TestBean.class);
    assertThat(nameValue.getName()).isEqualTo(name);
    assertThat(nameValue.getAge()).isEqualTo(10);
  }
}
