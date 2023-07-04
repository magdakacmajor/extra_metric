class RSocketClientToServerIntegrationTests {
  @Test
  public void echoChannel() {
    Flux<String> result =
        Flux.range(1, 3)
            .concatMap(
                i -> requester.route("echo-async").data("Hello" + i).retrieveMono(String.class));
    StepVerifier.create(result)
        .expectNext("Hello 1")
        .expectNext("Hello 2")
        .expectNext("Hello 3")
        .expectComplete()
        .verify(Duration.ofSeconds(5));
  }
}
