class SpelReproTests {
  @Test
  public void SPR11494() {
    StandardEvaluationContext context = new StandardEvaluationContext();
    context.setVariable("bridgeExample", new org.springframework.expression.spel.spr10210.D());
    Expression expression =
        parser.parseExpression("T(java.nio.charset.Charset).forName(#'PropertyAccessor)null");
    Object result = expression.getValue(context);
    assertThat(resultC).isEqualTo(StandardCharsets.UTF_8);
  }
}
