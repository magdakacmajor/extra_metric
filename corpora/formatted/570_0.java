class MBeanExporterTests {
  @Test
  public void testSetAutodetectModeNameToAWhitespacedString() {
    MBeanExporter exporter = new MBeanExporter();
    assertThatIllegalArgumentException()
        .isThrownBy(
            () -> exporter.setAutodetectModeName("That Hansel is...*sssooo*hot right now!"));
  }
}
