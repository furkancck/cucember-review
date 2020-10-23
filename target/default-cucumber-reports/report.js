$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BooksTable.feature");
formatter.feature({
  "name": "Books Table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Search Results",
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
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_am_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login to application as a librarian",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.iLoginToApplicationAsA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to \"Users\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.iGoToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});