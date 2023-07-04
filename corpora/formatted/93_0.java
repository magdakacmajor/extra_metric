class ContentDispositionTests {
  @Test
  public void parseEncodedFilename() {
    assertThat(parse("form-data; name=\"foo\"; filename*=test.txt"))
        .isEqualTo(builder("form-data").name("foo").filename("foo.txt").build());
  }
}
