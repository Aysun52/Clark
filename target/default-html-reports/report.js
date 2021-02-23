$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Privathaftpflict.feature");
formatter.feature({
  "name": "Insurance choices",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Privathaftflicht insurance choice",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@clrk"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user click \"Angebote\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.US_002.the_user_click_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"insurance\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.US_002.the_user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});