class AfterAdviceBindingTests {
  @Test
  public void testNeedsJoinPointStaticPart() {
    testBeanProxy.getAge();
    verify(mockCollaborator).needsJoinPoint("getAge");
  }
}
