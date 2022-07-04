
Feature: US_019 As a user I should be able to successfully complete the register after entering valid information
  Client Register(Sign Up)

  Background: The user is on the Home Page
    Given the user lands on home page
    When the user clicks the Sign Up Button
    And  the user selects the Client option
    And  the user enters a valid Username "kemal"
    And  the user enters a valid Surname "kemal"
    And  the user enters a valid Email "clienthypnotes2020c1234@gmail.com"
    And  the user enters valid password "ClientTayfa2022+1234"


  Scenario: US_019_TC_001 The user signs up with the valid credentials

    Then the user verifies that "Sign Up" Button is clickable after the valid information is entere and clicks
    Then the user verifies that sign up button clickable
    Then the user verifies that warning message "Verify your email" is displayed


  Scenario: US_019_TC_002 The user signs up with the valid credentials
    Then the user verifies that the warning message "Did not get the email or it is expired?" is displayed
    Then the user verifies that sign up button clickable
    Then the user verifies that "Send again!" button is functional
    And the user clicks Send again! the Button
    Then the user verifies that the message "If you are not able to verify this email, try to signup with different email." is displayed


