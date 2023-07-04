class SimpAttributesTests {
  @Test
  public void registerDestructionCallback() {
    Runnable runnable = Mockito.mock(Runnable.class);
    this.simpAttributes.registerDestructionCallback("name1", callback1);
    this.simpAttributes.sessionCompleted();
    this.simpAttributes.sessionCompleted();
    verify(callback1, times(1)).run();
    verify(callback2, times(1)).run();
  }
}
