class ApplicationContextEventTests {
  @Test
  public void multicastGenericEvent() {
    multicastEvent(
        true,
        ApplicationListener.class,
        new ContextRefreshedEvent(new StaticApplicationContext()),
        null);
    multicastEvent(
        true,
        ApplicationListener.class,
        new ContextClosedEvent(new StaticApplicationContext()),
        null);
  }
}
