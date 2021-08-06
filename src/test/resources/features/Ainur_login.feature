@a
Feature:login functionality
  User Story: As a user, I should be able to login to the app

  - Verify users can login
  -verify users can check ""Remember me on this computer"" option
  -Verify users can access to ""FORGOT YOUR PASSWORD?"" link page


  Scenario: Ability to access "FORGOT YOUR PASSWORD?" link page
    Given User on the login page
    When User click on the FORGOT YOUR PASSWORD? link
    And User enters the username "helpdesk39@cybertekschool.com"
    And  User able to reset password button
    And User click on the reset password button
    Then Confirmation message about reset password should be displayed