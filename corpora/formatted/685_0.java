class InProgressTests {
  @Test
  public void testSelectionFirst02() {
    evaluate("testMap.keySet().?[#this matches'.*o.*']", "[monday]", ArrayList.class);
    evaluate(
        "testMap.keySet().?[#this matches'.*r.*'].contains('saturday')", "true", Boolean.class);
    evaluate("testMap.keySet().?[#this matches'.*r.*'].size()", "3", Integer.class);
  }
}
