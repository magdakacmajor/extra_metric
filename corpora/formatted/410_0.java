class OperatorTests {
  @Test
  public void testMathOperatorDivide_ConvertToDouble() {
    evaluateAndAskForReturnType("8/4", new Float(2.0), Float.class);
  }
}
