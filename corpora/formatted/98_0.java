class MergedAnnotationsTests {
  @Test
  void getDirectWithoutAttributeAliases() {
    Method method = WebController.class.getMethod("handleMappedWithValueAttribute");
    MergedAnnotation<?> annotation = MergedAnnotations.from(method).get(RequestMapping.class);
    assertThat(annotation.getString("name")).isEqualTo("foo");
    assertThat(annotation.getStringArray("value")).containsExactly("/foo");
    assertThat(annotation.getStringArray("path")).containsExactly("/foo");
  }
}
