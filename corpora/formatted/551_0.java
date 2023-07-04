class DefaultServerResponseBuilderTests {
  @Test
  public void unprocessableEntity() {
    ServerResponse response = ServerResponse.unprocessableEntity().build();
    assertThat(response.statusCode()).isEqualTo(HttpStatus.UNPROCESSABLE_ENTITY);
  }
}
