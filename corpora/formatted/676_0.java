class GenericApplicationListenerAdapterTests {
  @Test
  public void genericListenerWildcardTypeTypeErasure() {
    GenericTestEvent<String> stringEvent = createGenericTestEvent("test");
    ResolvableType eventType = ResolvableType.forType(stringEvent.getClass());
    GenericEventType<String> eventType =
        GenericEventListener.forGenericEventType(
            wildcardEvent.class, genericGenericEventType.class);
    supportsEventType(false, GenericEventListener.class, eventType);
  }
}
