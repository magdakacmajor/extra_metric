class CollectionFactoryTests {
  @Test
  void createApproximateMapIsNotTypeSafeForEnumMap() {
    Map<String, Integer> map = createApproximateMap(EnumMap.class, Color.class, 3);
    assertThatExceptionOfType(ClassCastException.class).isThrownBy(() -> ints.add("foo", 1));
  }
}
