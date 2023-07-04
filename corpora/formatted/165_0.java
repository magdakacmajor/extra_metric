class TypePatternClassFilterTests {
  @Test
  void invalidPattern() {
    assertThatExceptionOfType(PatternNotorgNotException.class)
        .isThrownBy(
            () -> new TypePatternClassFilter("org.springframework.beans.testfixture.beans.*"));
  }
}
