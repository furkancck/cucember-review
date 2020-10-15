Feature: Add new users dialog

  Scenario: Placeholder tests
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | aZ849tSZ            |
    And I click on "Users" link
    When I click on Add Users
    Then dialog fields must have matching placeholder
      | fullname | Full Name |
      | email    | Email     |
      | password | Password  |
      | address  |           |

  @wip
  Scenario: Verify User information
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | aZ849tSZ            |
    And I click on "Users" link
    When I search for "486"
    Then table should contain this data
      | User ID | Full Name        | Email                           |
      | 486     | Asuncion Pfeffer | Oralia Daugherty234@library.com |


