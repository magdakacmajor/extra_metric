class MBeanExporterTests {
  @Test
  public void testRegisterNullNotificationListenerType() throws Exception {
    assertThatIllegalArgumentException().isThrownBy(() -> getMBeanObject(null));
  }
}
