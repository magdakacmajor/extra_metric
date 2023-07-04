class ConcurrentReferenceHashMapTests {
  @Test
  void shouldCreateWithInitialCapacityAndLoadFactor() {
    ConcurrentReferenceHashMap<Integer, String> map = new ConcurrentReferenceHashMap<>(16, 2);
    assertThat(map.getSegmentsSize()).isEqualTo(2);
    assertThat(map.getSegment(0).getSize()).isEqualTo(8);
    assertThat(map.getLoadFactor()).isEqualTo(0.75f);
  }
}
