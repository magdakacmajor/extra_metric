class AspectJAdviceParameterNameDiscoverAnnotationTests {
  @Test
  public void testAnnotationBinding() {
    assertParameterNames(
        getMethod("oneAnnotation"), "foo()", null, "ex", new String[] {"thisJoinPoint", "ex"});
  }
}
