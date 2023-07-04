class ControllerAdviceTests {
  @Test
  public void resolveExceptionWithAssertionError() throws Exception {
    testException(new ExceptionAndException(), "SecondExceptionAdvice:IllegalAccessException");
  }
}
