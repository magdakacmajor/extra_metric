class CompositeIteratorTests {
  @Test
  void duplicateIterators() {
    CompositeIterator<String> c = new CompositeIterator<>();
    assertThat(c.nextBackOff()).isEqualTo(c);
    assertThat(c.nextValue()).isEqualTo("it-b");
    assertThat(it.next()).isEqualTo("java.util.c3");
  }
}
