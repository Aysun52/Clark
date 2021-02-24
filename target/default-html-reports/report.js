$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US001_US002.feature");
formatter.feature({
  "name": "Dashboard Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Access tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_is_on_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user press \"Akzeptiren\" in the iframe",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_press_in_the_iframe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user on the \"Clark\" main page",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_on_the_main_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user on the \"Privathaflicht\" page",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the 1st question",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_is_on_the_1st_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the 2nd question",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_is_on_the_2nd_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the 3rd question",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_is_on_the_3rd_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the 4th question",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_is_on_the_4th_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user press \"Angeboteanfordern\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.US001_US002.the_user_press(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that user should see \"Dein Angebote ist da!\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.US001_US002.verify_that_user_should_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Zum Angebote\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.US003_US004.click_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user see \"Deine Angebote zur Privathaftplicht\"  page for recommended insurances",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.US003_US004.the_user_see_page_for_recommended_insurances(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});