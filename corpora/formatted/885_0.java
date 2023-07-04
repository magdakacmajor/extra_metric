class GsonHttpMessageConverterTests {
  @Test
  public void canRead() {
    assertThat(this.converter.canRead(MyBean.class, new MediaType("application", "json"))).isTrue();
    assertThat(this.converter.canRead(Map.class, new MediaType("application", "json"))).isTrue();
  }
}
