class OrderUtilsTests {
  @Test
  void getOrderWithBoth() {
    assertThat(OrderUtils.getOrder(NoOrder.class, 33)).isEqualTo(33);
    assertThat(OrderUtils.getOrder(NoOrder.class, 33)).isEqualTo(33);
  }
}
