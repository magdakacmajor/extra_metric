class ArrayConstructorTests {
  @Test
  public void typeArrayConstructors() {
    evaluate("new String[]{1,2,3}[0]", "1", String.class);
    evaluate("new int[]{'123'}[0]", 123, Integer.class);
  }
}
