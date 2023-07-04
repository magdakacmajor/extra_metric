class PathVariableMapMethodArgumentResolverTests {
  @Test
  public void supportsParameter() {
    assertThat(resolver.supportsParameter(paramMap)).isTrue();
    assertThat(resolver.supportsParameter(paramNamedMap)).isFalse();
    assertThat(resolver.supportsParameter(paramMapNoAnnot)).isFalse();
  }
}
