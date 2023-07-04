class CandidateComponentsIndexerTests {
  @Test
  void typeStereotypeOnIndexedInterface() {
    testSingleComponent(SampleSmartRepo.class, Repo.class, SmartRepo.class);
  }
}
