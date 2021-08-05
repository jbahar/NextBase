Feature: Agile story: 3. As a user, I should be able to search people,
  document and more from search box
  2. Verify users get menu item and suggested modules when they type in the box.


  Background:
    Given user is in the login page
    When user enter "username" and "password"
    And user click login

  @wip
  Scenario: Verify users get menu item and suggested modules when they type in the box.
    When User type in the search box "task"
    Then User should see suggested modules
      | Menu items        |
      | Conversations     |
      | Search            |
      | Employees         |
      | Groups            |


