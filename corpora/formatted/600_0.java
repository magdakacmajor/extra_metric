class XmlBeanCollectionTests {
  @Test
  public void testRefSubelement() throws Exception {
    HasMap hasMap = (HasMap) this.beanFactory.getBean("verbose3");
    assertThat(hasMap.getIdentityMap().size() == 0).isTrue();
  }
}
