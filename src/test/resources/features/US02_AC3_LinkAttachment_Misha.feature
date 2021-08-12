Feature: Link attachment functionality
  User Story:  As a user, I should be able to send message.

   -  Verify users can send message by clicking "MESSAGE" tab
   -  Verify users can cancel message.
   -  Verify users can attach link by clicking on the link icon


  Background:
    Given user is in the login page
    When user enter "username" and "password"
    Then user click login


@M
  Scenario: user click link icon to attach the link on the Message
    When user click Message link
    And user click link icon in the Message body
    And user enter "Metro Carpet - Test" and "www.metrocleaningcorp.com" in the designated areas
    And user click Save button
    And user click Send button
    And user can see message "Metro Carpet - Test" text and the link "www.metrocleaningcorp.com"
    Then user click the link "www.metrocleaningcorp.com" in the message ad title is: "Metro Carpet Cleaning"
