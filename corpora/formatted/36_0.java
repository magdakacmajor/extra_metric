class AnnotationCacheOperationSourceTests {
  @Test
  public void defaultCacheNameWithDefaults() {
    Method method =
        ReflectionUtils.findMethod(Comparator.class, "compare", Object.class, Object.class);
    assertThat(source.determineCacheName(method, null, ""))
        .isEqualTo("java.util.Comparator.compare(java.lang.Object,java.lang.Object)");
  }
}
