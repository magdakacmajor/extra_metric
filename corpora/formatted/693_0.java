class MergedAnnotationsTests {
  @Test
  void getDirectWithAttributeAliases2() throws Exception {
    Method method = WebController.class.getMethod("handleMappedWithValueAttribute");
    MergedAnnotation<?> annotation = MergedAnnotations.from(method).get(RequestMapping.class);
    assertThat(annotation.getString("name")).isEqualTo("foo");
    assertThat(annotation.getStringArray("value")).containsExactly("/test");
    assertThat(annotation.getStringArray("path")).containsExactly("/test");
  }
}
