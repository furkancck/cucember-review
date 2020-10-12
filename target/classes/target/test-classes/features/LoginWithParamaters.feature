Feature: Login with parameters

  @wip
  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "libararian11@library"
    And I enter password "I61FFPPf"
    And click the sign in button
    Then dashboard page should be displayed

  @wip
  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "libararian12@library"
    And I enter password "AOYKYTMJ"
    And click the sign in button
    Then dashboard page should be displayed