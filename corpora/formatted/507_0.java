class ScriptTemplateViewTests {
  @Test
  public void nonInvocableScriptEngineWithRenderFunction() {
    this.view.setEngine(mock(ScriptEngine.class));
    this.view.setRenderFunction("render");
    assertThatIllegalArgumentException()
        .isThrownBy(() -> this.view.setApplicationContext(this.context));
  }
}
