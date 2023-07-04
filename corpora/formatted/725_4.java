class CronSequenceGeneratorTests {
  @Test
  public void withSameMinuteRange() {
    new CronSequenceGenerator("* * 6-6 * * *").next(new Date(2012, 6, 1, 9, 0));
  }
}
