class ClassPathXmlApplicationContextTests {
  @Test
  public void testFactoryBeanAndApplicationListener() {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext(CLASS_WITH_PLACEHOLDER_CONTEXT, getClass());
    assertThat(ctx.containsBean("someMessageSource")).isTrue();
    ctx.close();
  }
}
