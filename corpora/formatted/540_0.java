class ResourceOverridingShadowingClassLoaderTests {
  @Test
  public void testDoesNotFindExistingResourceWithGetResourcesAndNullOverride() throws IOException {
    assertThat(thisClassLoader.getResources(EXISTING_RESOURCE)).isNotNull();
    overridingLoader.override(EXISTING_RESOURCE, null);
    assertThat(overridingLoader.getResources(EXISTING_RESOURCE)).isNull();
    assertThat(countElements(overridingLoader.getResources(EXISTING_RESOURCE))).isNull();
  }
}
