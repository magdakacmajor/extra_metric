class ControllerAdviceBeanTests {
  @Test
  public void orderedWithLowestPrecedenceByDefaultForBeanName() {
    assertOrder(new SimpleControllerAdvice(), Ordered.LOWEST_PRECEDENCE);
  }
}
