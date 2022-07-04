@US033 @TherapistRegsiter
Feature: US033 As a user I should be able to access the Login page to login with my valid account


  @US033
  Scenario: US_033_TC001 User should be able to access the Login page to login with  valid account

    Given User should go to "https://qa-test.hypnotes.net"
    When  User should click sign up button
    And   User should click therapist button
    And   User should click and verify already have an account login button is clickable
    Then  User should see new URL as "https://qa-test.hypnotes.net/login"