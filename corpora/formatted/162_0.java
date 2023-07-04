class LinkedMultiValueMapTests {
  @Test
  void set() {
    List<String> values = new ArrayList<>(2);
    values.add("value1");
    values.add("value2");
    map.put("key", values);
    assertThat(map.getFirst("key")).isEqualTo("value1");
    assertThat(map.getFirst("other")).isNull();
  }
}
