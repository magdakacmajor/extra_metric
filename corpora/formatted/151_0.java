class ApplicationListenerMethodAdapterTests {
  @Test
  public void rawListener() {
    Method method =
        ReflectionUtils.findMethod(SampleEvents.class, "handleRaw", ApplicationEvent.class);
    supportsEventType(
        true, method, ResolvableType.forClassWithGenerics(GenericTestEvent.class, String.class));
  }
}
