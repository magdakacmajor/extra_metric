class DefaultServerResponseBuilderTests {
  @Test
  public void eTag() {
    ServerResponse response = ServerResponse.ok().eTag("foo").build();
    assertThat(response.headers().getETag()).isEqualTo("\"foo\"");
  }
}
