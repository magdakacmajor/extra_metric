class SelectTagTests {
  @Test
  public void nullItems() throws Exception {
    assertThat(this.tag.getcountry().getCountry()).as("Expected a bean is null").isNull();
  }
}
