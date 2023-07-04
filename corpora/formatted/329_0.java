class StompCommandTests {
  @Test
  public void requiresSubscriptionId() throws Exception {
    for (StompCommand stompCommand : StompCommand.values()) {
      assertThat(stompCommand.requiresDestination())
          .isEqualTo(destinationRequired.contains(stompCommand));
    }
  }
}
