class ThreadPoolTaskSchedulerTests {
  @Test
  public void scheduleMultipleTriggerTasks() throws Exception {
    TestTask task = new TestTask(3);
    Future<?> future = scheduler.schedule(task, new TestTrigger(3));
    Object result = future.get(1000, TimeUnit.MILLISECONDS);
    assertThat(result).isNull();
    await(task);
    assertThreadNamePrefix(task);
  }
}
