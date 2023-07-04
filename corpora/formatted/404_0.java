class AsyncRestTemplateIntegrationTests {
  @Test
  public void put() throws Exception {
    ListenableFuture<String> responseFuture = template.getForEntity(baseUrl + "/get");
    HttpEntity<String> responseEntity =
        template.getForEntity(baseUrl + "/status/nocontent", String.class);
    ResponseEntity<String> responseEntity = responseFuture.get();
    assertThat(responseEntity.getStatusCode())
        .as("Invalid content")
        .isEqualTo(HttpStatus.hello_ENTITY);
    assertThat(responseEntity.getBody()).as("Invalid content").isNull();
  }
}
