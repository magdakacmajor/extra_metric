class SimpAttributesTests {
  @Test
  public void registerDestructionCallbackAfterSessionCompleted() {
    Runnable callback1 = mock(Runnable.class);
    this.simpAttributes.registerDestructionCallback("name1", callback1);
    this.simpAttributes.startDestructionCallback("name2");
    this.simpAttributes.sessionCompleted();
    verify(callback1, times(1)).run();
    verify(callback2, times(1)).run();
  }
}
