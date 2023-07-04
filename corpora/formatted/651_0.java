class RequestPredicatesTests {
  @Test
  public void queryParam() {
    String name = "foo";
    String value = "bar";
    RequestPredicate predicate = RequestPredicates.queryParam(p);
    MockServerRequest request = MockServerRequest.builder().uri(uri).build();
    assertThat(predicate.test(request)).isTrue();
    request = MockServerRequest.builder().build();
    assertThat(predicate.test(request)).isFalse();
  }
}
