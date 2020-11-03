$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user,\n  I should be able to login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login as a librarian",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@librarian"
    },
    {
      "name": "@smoke"
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
  "name": "I login as a librarian",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_login_as_librarian_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@student"
    },
    {
      "name": "@smoke"
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
  "name": "I login as a student",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_login_as_a_student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "books page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.booksPageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/LoginWithParamaters.feature");
formatter.feature({
  "name": "Login with parameters",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Login as librarian 11",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
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
  "name": "I enter username \"librarian11@library\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.i_enter_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"I61FFPPf\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.i_enter_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.click_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as librarian 12",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
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
  "name": "I enter username \"librarian12@library\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.i_enter_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"AOYKYTMJ\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.i_enter_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.click_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as librarian same line",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
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
  "name": "I login using \"librarian11@library\" and \"I61FFPPf\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefsWithParams.iLoginUsingAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/PageNavigation2.feature");
formatter.feature({
  "name": "Page navigation links",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "I login as a librarian",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_login_as_librarian_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to users page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click on \"Users\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.iClickOnLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Users\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.pageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "I login as a librarian",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_login_as_librarian_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to books page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click on \"Books\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.iClickOnLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Books\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.pageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ShowRecords.feature");
formatter.feature({
  "name": "Show Records Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "I login as a librarian",
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.LoginStepDefs.i_login_as_librarian_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify default values in Users page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I click on \"Users\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.review.library.step_defs.PageNavigationStepDefs.iClickOnLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show records default value should be 10",
  "keyword": "Then "
});
formatter.match({
  "location": "com.review.library.step_defs.ShowRecordsStepDefs.showRecordsDefaultValueShouldBe(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show records should have following options:",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.review.library.step_defs.ShowRecordsStepDefs.showRecordsShouldHaveFollowingOptions(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});