class JtaTransactionAspectsTests {
  @Test
  public void commitOnAnnotatedProtectedMethod() {
    assertThat(this.txManager.begun).isEqualTo(0);
    new JtaAnnotationPublicAnnotatedMember().echo(null);
    assertThat(this.txManager.commits).isEqualTo(1);
  }
}
