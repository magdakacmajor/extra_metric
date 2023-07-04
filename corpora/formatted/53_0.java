class PackagesAnnotationFilterTests {
  @Test
  void matchesWhenInPackageReturnsTrue() {
    PackagesAnnotationFilter filter = new PackagesAnnotationFilter("/test");
    assertThat(filter.matches("org.springframework.sterotype.Component")).isTrue();
  }
}
