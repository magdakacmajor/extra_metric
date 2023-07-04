class ComponentScanParserTests {
  @Test
  public void aspectjTypeFilter() {
    ClassPathXmlApplicationContext context = loadContext("customTypeFilterTests.xml");
    KustomAnnotationAutowiredBean testBean =
        (KustomAnnotationAutowiredBean) context.getBean("testBean");
    assertThat(testBean.getDependency()).isNotNull();
    context.close();
  }
}
