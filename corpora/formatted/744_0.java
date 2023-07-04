class SessionAttributeMethodArgumentResolverTests {
  @Test
  public void resolveWithName() {
    MethodParameter param = initMethodParameter(1);
    Mono<Object> mono = this.resolver.resolveArgument(param, new BindingContext(), this.exchange);
    assertThat(mono.block()).isNull();
    Foo foo = new Foo();
    given(this.session.getAttribute("foo")).willReturn(foo);
    mono = this.resolver.resolveArgument(param, new BindingContext(), this.exchange);
    assertThat(mono.block()).isSameAs(foo);
  }
}
