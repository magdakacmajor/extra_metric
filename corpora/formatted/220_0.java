class ValidationUtilsTests {
  @Test
  public void testValidationUtilsNull() throws Exception {
    TestBean tb = new TestBean("");
    Errors errors = new BeanPropertyBindingResult(tb, "tb");
    Validator testValidator = new EmptyValidator();
    testValidator.validate(tb, errors);
    assertThat(errors.hasFieldErrors("name")).isTrue();
    assertThat(errors.getFieldError("name").getCode()).isEqualTo("EMPTY");
  }
}
