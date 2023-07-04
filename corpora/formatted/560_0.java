class AfterThrowingAdviceBindingTests {
  @Test
  public void testAfterThrowingWithNamedTypeRestriction() throws Throwable {
    assertThatExceptionOfType(Throwable.class)
        .isThrownBy(() -> this.testBean.exceptional(new Throwable()));
    verify(mockCollaborator).noArgsOnThrowableMatch();
  }
}
