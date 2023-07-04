class CachingDestinationResolverTests {
  @Test
  public void noTargetSet() {
    assertThatIllegalArgumentException()
        .isThrownBy(
            () ->
                this.simpleService.setDestinationResolver(new SimpleCacheResolver<Object>("foo")));
  }
}
