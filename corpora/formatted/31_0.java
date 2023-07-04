class AspectJAdviceParameterNameDiscovererTests {
  @Test
  public void testTargetBindingWithBadPointcutExpressions() {
    assertException(
        getMethod("oneObject"),
        "target(x,y)",
        IllegalStateException.class,
        "Failed to bind all argument names:1 argument(s)could not be bound");
    assertException(
        getMethod("oneObject"),
        "this(x&&foo()",
        IllegalStateException.class,
        "Failed to bind all argument names:1 argument(s)could not be bound");
  }
}
