class ClassPathResourceTests {
  @Test
  void preserveLeadingSlashForClassRelativeAccess() {
    assertThat(new ClassPathResource("/test.html").getPath()).isEqualTo("test.html");
    assertThat(
            ((ClassPathResource) new ClassPathResource("").createRelative("/test.html")).getPath())
        .isEqualTo("test.html");
  }
}
