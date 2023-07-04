class AspectJAutoProxyCreatorTests {
  @Test
  public void testAspectsAndAdvisorAreApplied() {
    ClassPathXmlApplicationContext bf = newContext("aspectsWithOrdering.xml");
    ITestBean tb = (ITestBean) bf.getBean("adrian");
    assertThat(tb.getAge()).isEqualTo(20);
    assertThat(tb.getAge()).isEqualTo(20);
  }
}
