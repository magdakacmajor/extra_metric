class MappingJackson2SmileHttpMessageConverterTests {
  @Test
  public void canWrite() {
    assertThat(converter.canWrite(MyBean.class, new MediaType("application", "x-jackson-smile")))
        .isTrue();
    assertThat(converter.canWrite(MyBean.class, new MediaType("application", "json"))).isFalse();
    assertThat(converter.canWrite(MyBean.class, new MediaType("application", "xml"))).isFalse();
  }
}
