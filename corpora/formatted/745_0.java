class ScriptTemplateViewTests {
  @Test
  public void nonInvocableScriptEngine() throws Exception {
    this.view.setEngine(mock(ScriptEngine.class));
    this.view.setApplicationContext(this.wac);
  }
}
