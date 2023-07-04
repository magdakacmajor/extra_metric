class JmxUtilsTests {
  @Test
  void simpleMBean() throws Exception {
    assertThat(JmxUtils.isMBean(JmxClass.class))
        .as("Simple MBean(through inheritance)not detected correctly")
        .isTrue();
    assertThat(JmxUtils.isMBean(SpecializedJmxInterface.class)).isTrue();
    assertThat(JmxUtils.isMBean(JmxInterface.class)).isFalse();
  }
}
