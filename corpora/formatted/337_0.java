class EnableAsyncTests {
  @Test
  public void properExceptionForResolvedProxyDependencyMismatch() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(AsyncConfig.class, AsyncBeanWithInterface.class, AsyncBeanUser.class);
    assertThatExceptionOfType(UnsatisfiedDependencyException.class)
        .isThrownBy(ctx::refresh)
        .withCauseInstanceOf(BeanNotOfRequiredTypeException.class);
    ctx.close();
  }
}
