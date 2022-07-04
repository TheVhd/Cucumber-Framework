Feature:As a user, I should be able to attach files about problems

  Background:Files should be able add to the Voice Notes field
    Given User go to "hypnotesURL"
    When  User click Login Button
    Then  User enter "ClientloginEmail"
    And   User click SignInWithGoogle Button
    And   User verifies "https://qa-test.hypnotes.net/dashboard/calendar".
    And   User Clicks Clients
    Then  User clicks View Detail
    And   User clicks Presenting Issue
    And   User click Add new problem Button
    When  User create a new problem

    Scenario:TC_001_When the user  click on the microphone, recording should appear
      Given User click microphone
      When  User can appear recording
