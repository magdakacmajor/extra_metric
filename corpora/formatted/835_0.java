class RequestPartMethodArgumentResolverTests {
  @Test
  public void resolveNamedRequestPart() throws Exception {
    testResolveArgument(new SimpleBean("foo"), paramRequestPart);
  }
}
