Feature: User should be able to login to the app
  User story : As a user i should be able to login to the app
  AC:
  1- verify user can login
  2- verify use can check "Remember me on this computer" option
  3- verify user can access to "FORGET YOUR PASSWORD?" link page

  Scenario: verify user can login
    Given user is in the login page
    When user enter "username" and "password"
    And user click login
    Then user should be able to navigate to "CRM 24" page


  Scenario: verify user can check "Remember me on this computer"
    Given user is in the login page
    When user enter "username" and "password"
    Then user should be able to click on "Remember me on this computer"


  Scenario: verify user can access to "FORGET YOUR PASSWORD?" link page
    Given user is in the login page
    When user click on "FORGET YOUR PASSWORD?" button
    Then user should see "Get Password" on the title
