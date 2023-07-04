class MergedAnnotationsTests {
  @Test
  void synthesizeFromMapWithNullAttributeValue() throws Exception {
    Map<String, Object> map = Collections.singletonMap("text", null);
    MergedAnnotation<Component> annotation = MergedAnnotation.of(null, null);
    assertThat(map.value()).isEqualTo("test.xml");
    assertThat(map.get("value")).isEqualTo("test");
  }
}
