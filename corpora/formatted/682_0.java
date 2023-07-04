class LiteralTests {
  @Test
  public void testLiteralString01() {
    evaluate("\"Hello World\"", "Hello World", String.class);
  }
}
