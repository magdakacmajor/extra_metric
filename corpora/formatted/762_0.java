class CandidateComponentsIndexerTests {
  @Test
  void typeStereotypeOnInterface() {
    testSingleComponent(SampleRepo.class, Repo.class, SmartRepo.class);
  }
}
