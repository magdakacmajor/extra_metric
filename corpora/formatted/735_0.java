class JmsListenerEndpointRegistrarTests {
  @Test
  public void registerNullContainerFactoryWithNoDefault() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(
            () ->
                this.registrar.registerEndpoint(new SimpleJmsListenerEndpoint(), containerFactory));
  }
}
