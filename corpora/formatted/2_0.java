class RequestPartMethodArgumentResolverTests {
  @Test
  public void resolveRequestPartRequired() throws Exception {
    testResolveArgument(new SimpleBean("foo"), paramValidRequestPart);
  }
}
