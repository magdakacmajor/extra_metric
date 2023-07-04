class ListTests {
  @Test
  public void testRelOperatorsBetweenErrors02() {
    evaluate("'efg'between{'abc','xyz'}", "true", Boolean.class);
  }
}
