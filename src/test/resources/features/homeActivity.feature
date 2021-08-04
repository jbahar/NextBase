Feature: User Should be able to send message
  AC:
  1- verify user can send message by clicking "MESSAGE" tab
  2- verify user can cancel message
  3- verify user can attach link by clicking on the link icon

  Background:
    Given user is in the login page
    When user enter "username" and "password"
    And user click login

  Scenario: verify user can send message by clicking "MESSAGE" tab
    And user is in home page and click on message button
    Then button should be clickable


    Scenario: verify user can cancel message
      And user is in home page and click on message button
      Then user can cancel the message

  @wip
  Scenario: verify user can attach link by clicking on the link icon
    And user is in home page and click on message button
    Then user can be clink on the link icon


