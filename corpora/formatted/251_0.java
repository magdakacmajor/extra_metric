class BeanWrapperGenericsTests {
  @Test
  public void testSettingLongPropertyWithGenericInterface() {
    BeanWrapper bw = new BeanWrapperImpl(bar);
    bw.setPropertyValue("version1", "10");
    assertThat(bar.getVersion()).isEqualTo(new Double(10.0));
  }
}
