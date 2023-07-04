class HttpEntityMethodArgumentResolverTests {
  @Test
  public void emptyBodyWithRxJava2Single() {
    ResolvableType type = httpEntityType(io.reactivex.Single.class, String.class);
    HttpEntity<io.reactivex.Observable<String>> entity = resolveValueWithEmptyBody(type);
    StepVerifier.create(entity.getBody().toFlowable()).expectNextCount(0).expectComplete().verify();
  }
}
