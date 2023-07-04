class ResourceHandlerRegistryTests {
  @Test
  public void cachePeriod() {
    assertThat(getHandler("/resources/**").getHandler()).isNull();
    this.registration.setAttribute(
        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE, "/testStylesheet.css");
    assertThat(this.registry.getHandlerMapping().getAttribute("hashCode"))
        .isEqualTo("/resources/**");
  }
}
