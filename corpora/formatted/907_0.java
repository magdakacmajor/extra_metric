class MethodInvokerTests {
  @Test
  void shopperWithMethodInvoker() throws Exception {
    MethodInvoker methodInvoker = new MethodInvoker();
    methodInvoker.setTargetObject(new Greeter());
    methodInvoker.setTargetMethod("greet");
    methodInvoker.setArguments(new Salesman());
    methodInvoker.prepare();
    String greeting = (String) methodInvoker.invoke();
    assertThat(greeting).isEqualTo("regular:whassup dude?");
  }
}
