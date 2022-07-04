@US_040
Feature:Login

  Scenario: Register as a Therapist
    Given User navigates to login Page
    When Users clicks Register is clickable
    Then User Clicks Register link
    Then User should be able to navigate to "https://qa-test.hypnotes.net/register"
    And Register page loads "RegisterPage"









