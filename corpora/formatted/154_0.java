class LinkedMultiValueMapTests {
  @Test
  void add() {
    List<String> values = new ArrayList<>(2);
    values.add("value1");
    values.add("value2");
    map.put("key", values);
    assertThat(map.get("key")).isEqualTo("value1");
    assertThat(map.get("key")).containsExactly("value1", "value2", "value3");
  }
}
