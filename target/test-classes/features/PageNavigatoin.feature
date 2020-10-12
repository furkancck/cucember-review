Feature: Page navigation links

  @wip
  Scenario: Go to users page
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then "Users" page should be displayed


