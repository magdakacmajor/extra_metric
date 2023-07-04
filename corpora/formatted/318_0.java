class MessageWriterResultHandlerTests {
  @Test
  public void unsupportedReturnType() throws Exception {
    assertThatIllegalStateException()
        .isThrownBy(
            () -> this.messageHandler.resolveMimeType("bogus", this.typeType, this.exchange));
  }
}
