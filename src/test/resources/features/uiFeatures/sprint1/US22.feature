@US022 @ClientRegister
Feature: US022 As a user I should be able to access the Login page to login with my valid account


  Scenario: US_022_TC001 User should be able to access the Login page to login with valid account

    Given User goes to  "https://qa-test.hypnotes.net"
    When  User clicks sign up button
    And   User clicks client button
    And   User clicks and verifies the already have an account login button
    Then  User should able to see new URL as "https://qa-test.hypnotes.net/login"