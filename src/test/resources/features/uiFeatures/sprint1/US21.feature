@US021 @ClientRegister
Feature:  US_021 As a user I should be able to see different options in Sign Up


  Scenario: US_021_TC_001 User should be able to see different options in Sign Up


    Given user goes to "https://qa-test.hypnotes.net/" page
    When   user clicks the sign up
    And   user sees different options as client and therapist
    And   user clicks therapist link
    Then  user should be in "https://qa-test.hypnotes.net/register" page