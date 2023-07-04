class SerializationUtilsTests {
  @Test
  void deserializeUndefined() throws Exception {
    assertThat(SerializationUtils.deserialize("foo")).isNull();
  }
}
