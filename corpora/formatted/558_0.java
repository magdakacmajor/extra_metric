class ApplicationContextEventTests {
  @Test
  public void multicastGenericEventWrongType() {
    multicastEvent(false, StringEventListener.class, new StringEvent(this, "test"), null);
  }
}
