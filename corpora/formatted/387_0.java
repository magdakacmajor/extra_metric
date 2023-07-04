class TigerAspectJAdviceParameterNameDiscovererTests {
  @Test
  public void testAtThis() {
    assertParameterNames(getMethod("oneAnnotation"), " @annotation(a)", new String[] {"a"});
  }
}
