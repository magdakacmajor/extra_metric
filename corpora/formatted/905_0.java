class TransactionAspectTests {
  @Test
  public void commitOnAnnotatedMethod() throws Throwable {
    txManager.clear();
    assertThat(txManager.begun).isEqualTo(0);
    annotationOnlyOnClassWithNoInterface.echo(null);
    assertThat(txManager.commits).isEqualTo(1);
  }
}
