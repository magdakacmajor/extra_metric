class AspectJAdviceParameterNameDiscovererTests {
  @Test
  public void testThisBindingTwoCandidates() {
    assertException(
        getMethod("oneObject"),
        "this(x)| | target(y)",
        AmbiguousBindingException.class,
        "Found 2 candidate this(),target()or args()variables but only one unbound argument slot");
  }
}
