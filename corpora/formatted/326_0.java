class DefaultEntityResponseBuilderTests {
  @Test
  public void varyBy() {
    String body = "foo";
    EntityResponse<String> result = EntityResponse.fromObject(body).varyBy("foo").build();
    List<String> expected = Collections.singletonList("foo");
    assertThat(result.headers().getVary()).isEqualTo(expected);
  }
}
