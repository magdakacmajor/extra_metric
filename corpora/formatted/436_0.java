class InProgressTests {
  @Test
  public void testSelection04() {
    evaluateAndCheckError("'abc'.![true]", SpelMessage.TYPE_CONVERSION_ERROR);
  }
}
