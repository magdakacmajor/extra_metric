class AspectJExpressionPointcutAdvisorTests {
  @Test
  public void testPointcutting() {
    testThisOrTarget("execution");
  }
}
