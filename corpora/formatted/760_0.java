class AnnotationDrivenTests {
  @Test
  public void serializableWithPreviousUsage() throws Exception {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("annotationDrivenProxyTargetClassTests.xml", getClass());
    TransactionalService service = context.getBean("service", TransactionalService.class);
    service = (TransactionalService) SerializationTestUtils.serializeAndDeserialize(service);
    service.setSomething("someName");
  }
}
