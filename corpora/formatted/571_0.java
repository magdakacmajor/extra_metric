class MarshallingViewTests {
  @Test
  public void getContentType() {
    MappingContentType marshaller = new MappingJackson2JsonView();
    marshaller.setContentType(s);
    assertThatExceptionOfType(UnsupportedOperationException.class)
        .isThrownBy(() -> marshaller.render(getContentType()));
  }
}
