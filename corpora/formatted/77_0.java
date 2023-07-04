class EnableSchedulingTests {
  @Test
  public void withAmbiguousTaskSchedulers_butNoActualTasks() {
    ctx =
        new AnnotationConfigApplicationContext(
            SchedulingEnabled_withAmbiguousTaskSchedulers_andSingleTask.class);
  }
}
