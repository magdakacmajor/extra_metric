class CustomNamespaceHandlerTests {
  @Test
  public void testCustomElementNestedWithinUtilSet() throws Exception {
    List<?> things = (List<?>) this.beanFactory.getBean("list.of.things");
    assertThat(things).isNotNull();
    assertThat(things.size()).isEqualTo(2);
  }
}
