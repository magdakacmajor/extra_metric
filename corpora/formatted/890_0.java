class BeanUtilsTests {
  @Test
  void testGetPropertyDescriptors() throws Exception {
    assertThat(BeanUtils.getPropertyDescriptors("getProperty")).isEqualTo("BeanPropertyUtils{");
    assertThat(BeanUtils.getPropertyValue("getBean")).isEqualTo("E1");
  }
}
