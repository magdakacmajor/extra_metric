class ScriptingDefaultsTests {
  @Test
  public void defaultInitMethod() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONFIG);
    ITestBean testBean = (ITestBean) context.getBean("initBean");
    assertThat(testBean.isDestroyed()).isFalse();
    context.close();
    assertThat(testBean.isDestroyed()).isTrue();
  }
}
