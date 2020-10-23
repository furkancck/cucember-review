 @login
Feature: Login
  As a user,
  I should be able to login
@librarian @smoke
  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard page should be displayed
  @student @smoke
  Scenario: Login as a student
    Given I am on the login page
    When I login as a student
    Then books page should be displayed

  @admin
  Scenario: Login as a admin
    Given I am on the login page
    When I login as a admin
    Then dashboard page should be displayed