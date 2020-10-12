@smoke
Feature: Page navigation links

  Background:
    Given I am on the login page
    And I login as a librarian


  Scenario: Go to users page
    When I click on "Users" link
    Then "Users" page should be displayed


  Scenario: Go to books page
    When I click on "Books" link
    Then "Books" page should be displayed



