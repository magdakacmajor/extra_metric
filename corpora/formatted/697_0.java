class AspectJAdviceParameterNameDiscovererTests {
  @Test
  public void testNoArgs() {
    assertParameterNames(
        getMethod("noArgs"),
        "foo()",
        "obj",
        null,
        IllegalStateException.class,
        "Found 2 candidate this(),target()or args()variables but only one unbound argument slot");
  }
}
