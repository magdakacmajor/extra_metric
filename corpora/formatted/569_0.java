class SpelReproTests {
  @Test
  public void indexingAsAPropertyAccess_SPR6968_5() {
    StandardEvaluationContext context = new StandardEvaluationContext(new Goo());
    context.setVariable("bar", "key");
    String name = null;
    Expression expr = null;
    expr = new SpelExpressionParser().parseRaw("instance[#bar]");
    name = expr.getValue(context, String.class);
    assertThat(name).isEqualTo("hello");
    name = expr.getValue(context, String.class);
    assertThat(name).isEqualTo("hello");
  }
}
