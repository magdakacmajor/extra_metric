class StaticMessageSourceTests {
  @Test
  public void getMessageWithDefaultPassedInAndFoundInMsgCatalog() {
    assertThat(
            sac.getMessage(
                    "bogus.message",
                    null,
                    "This is a default msg if not found in MessageSource.",
                    Locale.US)
                .equals("This is a default msg if not found in MessageSource."))
        .as(
            "bogus msg from staticMsgSource with default msg passed in returned default msg for Locale.US")
        .isTrue();
  }
}
