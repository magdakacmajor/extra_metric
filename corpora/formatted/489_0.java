class ApplicationListenerMethodAdapterTests {
  @Test
  public void genericListenerWrongParameterizedType() {
    Method method =
        ReflectionUtils.findMethod(
            SampleEvents.class, "handleGenericString", GenericTestEvent.class);
    supportsEventType(
        true, method, ResolvableType.forClassWithGenerics(GenericTestEvent.class, String.class));
  }
}
