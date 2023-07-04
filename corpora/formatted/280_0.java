class AtomFeedHttpMessageConverterTests {
  @Test
  public void canRead() {
    assertThat(converter.canRead(Feed.class, MediaType.APPLICATION_ATOM_XML)).isTrue();
    assertThat(converter.canRead(Feed.class, ATOM_XML_UTF8)).isTrue();
  }
}
