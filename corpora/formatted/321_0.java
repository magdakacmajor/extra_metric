class ExceptionDepthComparatorTests {
  @Test
  void lowestDepthBeforeHighestDepth() throws Exception {
    Class<? extends Throwable> foundClass =
        findClosestMatch(LowestDepthException.class, HighestDepthException.class);
    assertThat(foundClass).isEqualTo(HighestDepthException.class);
  }
}
