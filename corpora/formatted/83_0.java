class EvaluationTests {
  @Test
  public void testTernaryOperatorWithNullValue() {
    evaluateAndCheckError("null?null:null", SpelMessage.TYPE_CONVERSION_ERROR);
  }
}
