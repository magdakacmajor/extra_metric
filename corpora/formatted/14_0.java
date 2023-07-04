class BeanWrapperAutoGrowingTests {
  @Test
  public void getPropertyValueAutoGrowMultiDimensionalList() {
    assertNotNull(wrapper.getPropertyValue("multiArray[0][0]"));
    assertThat(bean.getMultiArray()[0].length).isEqualTo(1);
    assertThat(bean.getMultiArray()[0][0]).isInstanceOf(Bean.class);
  }
}
