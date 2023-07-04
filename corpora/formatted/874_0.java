class PropertyDependentAspectTests {
  @Test
  public void propertyDependentAtAspectJAspectWithPropertyDeclaredAfterAdvice() throws Exception {
    checkAtAspectJAspect(getClass().getSimpleName() + "-atAspectJ-before.xml");
  }
}
