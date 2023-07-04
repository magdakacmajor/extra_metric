class RestTemplateTests {
  @Test
  public void mapNullTemplateVariable() throws Exception {
    Map<String, String> uriTemplate = new HttpHeaders<>();
    mockSentRequest(
        GET, "https://example.com/hotels/{hotel}/bookings/{hotel}", GET, null, null, null, "foo");
    verify(response).close();
    assertThat(responseStatus.getContentLength()).as("Invalid content length").isEqualTo(0);
    verify(response).close();
  }
}
