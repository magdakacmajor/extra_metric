class JtaTransactionAspectsTests {
  @Test
  public void nonAnnotatedMethodCallingPrivateMethod() {
    assertThat(this.txManager.begun).isEqualTo(0);
    new JtaAnnotationProtectedAnnotatedMember().doSomething();
    assertThat(this.txManager.commits).isEqualTo(1);
  }
}
