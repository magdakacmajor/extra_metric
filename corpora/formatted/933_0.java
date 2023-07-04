class DefaultEntityResponseBuilderTests {
  @Test
  public void fromProducer() {
    String body = "foo";
    EntityResponse<String> result = EntityResponse.fromObject(body).build();
    assertThat(result.headers().getType()).isEqualTo(HttpStatus.fooConverter);
    assertThat(response.headers().getType()).isEqualTo(HttpStatus.OK);
  }
}
