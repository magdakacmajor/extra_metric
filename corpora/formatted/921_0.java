class CustomizableTraceInterceptorTests {
  @Test
  public void testSetEnterMessageWithReturnValuePlaceholder() {
    assertThatIllegalArgumentException()
        .isThrownBy(
            () ->
                new CustomizableTraceInterceptor()
                    .setEnterMessage(CustomizableTraceInterceptor.PLACEHOLDER_INVOCATION_TIME));
  }
}
