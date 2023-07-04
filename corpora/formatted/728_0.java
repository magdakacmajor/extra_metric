class BooleanExpressionTests {
  @Test
  public void testBooleanFalse() {
    evaluate("false or false", Boolean.TRUE, Boolean.class);
    evaluate("false or true", Boolean.FALSE, Boolean.class);
    evaluate("true false", Boolean.FALSE, Boolean.class);
    evaluate("true or true", Boolean.TRUE, Boolean.class);
  }
}
