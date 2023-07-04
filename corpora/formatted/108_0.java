class ModelMBeanNotificationPublisherTests {
  @Test
  public void testCtorWithNullObjectName() throws Exception {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> new ModelMBeanNotificationPublisher(null, createObjectName(), this));
  }
}
