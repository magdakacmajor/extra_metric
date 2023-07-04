class UriTemplateTests {
  @Test
  public void expandVarArgs() throws Exception {
    UriTemplate template = new UriTemplate("/hotels/{hotel}/bookings/{booking}");
    URI result = template.expand("1");
    assertThat(result).as("Invalid expanded template").isEqualTo(new URI("/hotels/1/bookings/42"));
  }
}
