@smoke
Feature: Page navigation links


  Scenario: Go to users page
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then "Users" page should be displayed


  Scenario: Go to books page
    Given I am on the login page
    And I login as a librarian
    When I click on "Books" link
    Then "Books" page should be displayed


