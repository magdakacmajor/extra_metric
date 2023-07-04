class RequestConditionHolderTests {
  @Test
  public void combineIncompatible() {
    RequestConditionHolder params = new RequestConditionHolder(new ParamsRequestCondition("name"));
    RequestConditionHolder params2 = new RequestConditionHolder(new ParamsRequestCondition("name"));
    assertThatExceptionOfType(ClassCastException.class).isThrownBy(() -> params.combine(paramsMsg));
  }
}
