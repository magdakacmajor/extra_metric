class ClientResponseWrapperTests {
  @Test
  public void rawStatusCode() {
    int status = 999;
    given(mockResponse.getRawStatusCode()).willReturn(status);
    assertThat(wrapper.statusCode()).isSameAs(status);
  }
}
