class BeanWrapperAutoGrowingTests {
  @Test
  public void getPropertyValueNullValueInNestedPathNoDefaultConstructor() {
    assertThat(wrapper.getPropertyValue("nested.prop")).isNull();
  }
}
