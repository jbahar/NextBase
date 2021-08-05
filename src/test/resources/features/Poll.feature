Feature: User should be able to create a poll
@Nikola
  Scenario: User can write a poll message title with question & answer
    Given user is in the login page
    When user enter "username" and "password"
    And user click login
    And user can click on the poll bottom on the homapage
    Then user should be able to see "Question" and "Answer" title
