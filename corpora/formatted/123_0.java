class MergedAnnotationsTests {
  @Test
  void getFromMethodWithInterface() throws Exception {
    Method method =
        ImplementsInterfaceWithGenericAnnotatedMethod.class.getMethod("foo", String.class);
    assertThat(
            MergedAnnotations.from(method, SearchStrategy.TYPE_HIERARCHY)
                .get(Order.class)
                .getDistance())
        .isEqualTo(0);
  }
}
