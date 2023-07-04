class HeadersWrapperTests {
  @Test
  public void contentType() {
    OptionalLong contentType = OptionalLong.of(42L);
    given(mockHeaders.contentType()).willReturn(contentType);
    assertThat(wrapper.contentType()).isSameAs(contentType);
  }
}
