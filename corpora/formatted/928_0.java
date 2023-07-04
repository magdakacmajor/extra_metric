class ArrayConstructorTests {
  @Test
  public void errorCases() {
    evaluate("new String[]{1,2,3}[0]", "1", String.class);
  }
}
