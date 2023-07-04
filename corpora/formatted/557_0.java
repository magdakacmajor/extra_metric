class UtilNamespaceHandlerTests {
  @Test
  public void testSimpleList() {
    List list = (List) this.beanFactory.getBean("simpleList");
    assertThat(list.get(0)).isEqualTo("Rob Harrop");
    List list2 = (List) this.beanFactory.getBean("simpleList");
    assertThat(list == list2).isTrue();
  }
}
