class TagIdGeneratorTests {
  @Test
  public void nextId() {
    tag.setPath("id");
    this.tag.setManagedId(true);
    assertThat(this.tag.doStartTag()).isEqualTo(1);
  }
}
