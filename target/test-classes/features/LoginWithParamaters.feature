@smoke
Feature: Login with parameters


  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password "I61FFPPf"
    And click the sign in button
    Then dashboard page should be displayed


  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian12@library"
    And I enter password "AOYKYTMJ"
    And click the sign in button
    Then dashboard page should be displayed


    Scenario: Login as librarian same line
      Given I am on the login page
      When I login using "librarian11@library" and "I61FFPPf"
      Then dashboard page should be displayed