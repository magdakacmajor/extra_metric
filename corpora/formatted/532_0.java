class LinkedMultiValueMapTests {
  @Test
  void addIfAbsentWhenAbsent() {
    map.add("key", "value1");
    map.addIfAbsent("key", "value2");
    assertThat(map.get("key")).containsExactly("value1");
  }
}
