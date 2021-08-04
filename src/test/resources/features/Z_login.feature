Feature: login functionality
  User Story: As a user, I should be able to login to the app

  - Verify users can login
  -verify users can check ""Remember me on this computer"" option
  -Verify users can access to ""FORGOT YOUR PASSWORD?"" link page


  Background: Assuming user ia on login page
    Given user is on the login page


  Scenario: login as user
    When user enters the username "helpdesk39@cybertekschool.com "
    And user enters the password "UserUser"
    And user click on the login button
    Then user can see homepage

  @Z
  Scenario: ability to click checkbox "Remember me on this computer"
    When user click on the "checkbox"
    Then "checkbox" will be selected

  Scenario: ability to access "FORGOT YOUR PASSWORD?" link page
    When user click on the "FORGOT YOUR PASSWORD?" link
    And  user is able to reset the password
    And user click on the reset password
    And user enters the username "helpdesk39@cybertekschool.com "
    Then "A code to reset your password and your registration information has just been sent to your e-mail address. Please check your e-mail. Note that the reset code is re-generated on each request." should be displayed








