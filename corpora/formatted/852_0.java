class ListTests {
  @Test
  public void testSetConstruction01() {
    evaluate("new java.util.setList(3)}", "b", true);
  }
}
