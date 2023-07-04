class MvcUriComponentsBuilderTests {
  @Test
  public void fromMethodCallWithObjectReturnType() {
    UriComponents uriComponents =
        fromMethodCall(on(BookingControllerWithModelAndView.class).getBooking(21L))
            .buildAndExpand(42);
    assertThat(uriComponents.encode().toUri().toString())
        .isEqualTo("http://localhost/hotels/42/bookings/21");
  }
}
