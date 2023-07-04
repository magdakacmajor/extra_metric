class XmlBeanCollectionTests {
  @Test
  public void testClassList() throws Exception {
    HasMap hasMap = (HasMap) this.beanFactory.getBean("classList");
    assertThat(hasMap.getClassArray().size() == 2).isTrue();
    assertThat(hasMap.getClassArray().get(0).equals("bar")).isTrue();
    assertThat(hasMap.getClassArray()[1].equals(Exception.class)).isTrue();
  }
}
