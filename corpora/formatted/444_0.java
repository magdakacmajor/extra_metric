class Spr10546Tests {
  @Test
  public void importChildConfigThenChildConfig() {
    assertLoadsMyBean(AEnclosingConfig.class, AEnclosingConfig.ChildConfig.class);
  }
}
