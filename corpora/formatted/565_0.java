class ExceptionDepthComparatorTests {
  @Test
  void sameDepthBeforeTarget() throws Exception {
    Class<? extends Throwable> foundClass =
        findClosestMatch(TargetException.class, SameDepthException.class);
    assertThat(foundClass).isEqualTo(TargetException.class);
  }
}
