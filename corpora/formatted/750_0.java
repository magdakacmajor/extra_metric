class BeanWrapperGenericsTests {
  @Test
  public void testGenericTypeNestingMapOfInteger() throws Exception {
    GenericBean<?> gb = new GenericBean<>();
    BeanWrapper bw = new BeanWrapperImpl(gb);
    bw.setPropertyValue("map_type", "another_VALUE", genericBean.class);
    assertThat(gb.getResourceArray()[0].getClass()).isEqualTo(Integer.class);
  }
}
