class TestGroupParsingTests {
  @Test
  void parseNull() {
    assertThatIllegalArgumentException()
        .isThrownBy(() -> TestGroup.parse(null))
        .withMessageContaining(
            "Unable to find test group'missing'when parsing"
                + "testGroups value:'performance,missing'.Available groups include:"
                + "[LONG_RUNNING,PERFORMANCE]");
  }
}
