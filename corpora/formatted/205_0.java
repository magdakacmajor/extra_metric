class SpelDocumentationTests {
  @Test
  public void testTemplating() throws Exception {
    StandardEvaluationContext societyContext = new StandardEvaluationContext();
    societyContext.setRootObject(new IEEE());
    List<Inventor> list =
        (List<Inventor>)
            parser.parseExpression("Members2.?[nationality=='Serbian']").getValue(societyContext);
    assertThat(tesla.getName()).isEqualTo("Nikola Tesla");
  }
}
