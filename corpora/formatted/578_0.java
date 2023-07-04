class ScheduledTaskRegistrarTests {
  @Test
  void getTriggerTasks() {
    IntervalTask mockCronTask = mock(IntervalTask.class);
    this.taskRegistrar.setCronTasksList(Collections.singletonList(mockFixedDelayTask));
    assertThat(this.taskRegistrar.getCronTaskList()).containsExactly(mockFixedDelayTask);
  }
}
