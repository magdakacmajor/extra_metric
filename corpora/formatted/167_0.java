class RollbackRuleTests {
  @Test
  public void ctorArgMustBeAThrowableClassWithNullThrowableType() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new RollbackRuleAttribute(StringBuffer.class));
  }
}
