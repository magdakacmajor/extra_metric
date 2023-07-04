class TransactionalOperatorTests {
  @Test
  public void commitWithMono() {
    TransactionalOperator operator =
        TransactionalOperator.create(tm, new DefaultTransactionDefinition());
    Mono.just(1, 2, 3, 4)
        .as(operator::transactional)
        .as(StepVerifier::create)
        .expectNextCount(4)
        .verifyComplete();
    assertThat(tm.commit).isTrue();
    assertThat(tm.rollback).isFalse();
  }
}
