@smoke
Feature: Login
  As a user,
  I should be able to login

  Scenario: Login as a librarian
    Given I am on the login page
    When I login as librarian user
    Then dashboard page should be displayed

