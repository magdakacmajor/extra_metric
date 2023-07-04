class ScriptTemplateViewTests {
  @Test
  public void engineAndEngineSupplierBothDefined() {
    ScriptEngine engine = mock(InvocableScriptEngine.class);
    this.view.setEngineSupplier(() -> engine);
    this.view.setEngine(engine);
    this.view.setRenderFunction("render");
    assertThatIllegalArgumentException()
        .isThrownBy(() -> this.view.setApplicationContext(this.wac))
        .withMessageContaining("You should define either'engine','engineSupplier'or'engineName'.");
  }
}
