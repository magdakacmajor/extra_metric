class HttpHeadersTests {
  @Test
  public void contentLanguage() {
    headers.set(HttpHeaders.CONTENT_LANGUAGE, "de,en_CA");
    assertThat(headers.getContentLanguage())
        .as("Invalid Accept-Control header")
        .isEqualTo(Locale.GERMAN);
  }
}
