$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("learn/agile/demos/divsionPostivieInt.feature");
formatter.feature({
  "name": "Division of Postitive Integer resulting in whole integer Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "multiply two positive integers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the demo page",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSteps.i_am_on_the_demo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I divide the numbers 6 by  2",
  "keyword": "When "
});
formatter.match({
  "location": "DemoSteps.iDivideTheNumbersBy(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the result is 3",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.the_result_is(int)"
});
formatter.result({
  "status": "passed"
});
});