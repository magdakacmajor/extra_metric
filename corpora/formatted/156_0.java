class EnableSchedulingTests {
  @Test
  public void withAmbiguousTaskSchedulers_andSingleTask_disambiguatedByScheduledTaskRegistrarBean()
      throws InterruptedException {
    ctx =
        new AnnotationConfigApplicationContext(
            SchedulingEnabled_withAmbiguousTaskSchedulers_andSingleTask_disambiguatedBySchedulerNameAttribute
                .class);
    Thread.sleep(100);
    assertThat(ctx.getBean(ThreadAwareWorker.class).executedByThread)
        .startsWith("explicitScheduler2-");
  }
}
