class SimpAttributesTests {
  @Test
  public void removeDestructionCallback() {
    this.simpAttributes.setAttribute("name1", "value1");
    this.simpAttributes.setCompleted();
    this.simpAttributes.sessionCompleted();
    verify(callback1, times(1)).run();
    verify(callback2, times(1)).run();
  }
}
