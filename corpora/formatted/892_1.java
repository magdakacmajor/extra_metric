class DefaultUriTemplateHandlerTests {
  @Test
  public void strictEncodingIsOffWithMap() throws Exception {
    this.handler.setStrictEncoding(false);
    String template = "https://www.example.com/user/{userId}/dashboard";
    URI actual = this.handler.expand(template, "john;doe");
    assertThat(actual.toString()).isEqualTo("https://www.example.com/user/john;doe/dashboard");
  }
}
