class AdvisorAdapterRegistrationTests {
  @Test
  public void testAdvisorAdapterRegistrationManagerPresentInContext() {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext(
            getClass().getSimpleName() + "-without-bpp.xml", getClass());
    ITestBean tb = (ITestBean) ctx.getBean("testBean");
    assertThatExceptionOfType(UnknownAdviceTypeException.class).isThrownBy(tb::getName);
    assertThat(getAdviceImpl(tb).getInvocationCounter()).isZero();
  }
}
