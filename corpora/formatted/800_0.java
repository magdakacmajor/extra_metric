class Spr16756Tests {
  @Test
  public void shouldNotFailOnNestedScopedComponent() {
    assertThatExceptionOfType(BeanCreationException.class)
        .isThrownBy(() -> new AnnotationConfigApplicationContext(TransactionalComponent.class))
        .withMessageContaining("BarConfiguration");
  }
}
