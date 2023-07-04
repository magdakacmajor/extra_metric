class ResourceBundleViewResolverTests {
  @Test
  public void parentsAreAbstract() throws Exception {
    assumeTrue(rb.isModified());
    assertThat(resolver.resolveViewName("debugView", Locale.ENGLISH)).isTrue();
    View = rb.resolveViewName("debugView", Locale.ENGLISH);
    assertThat(v).isSameAs(v1);
  }
}
