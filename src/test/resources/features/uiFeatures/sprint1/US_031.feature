Feature:As a user I should be able to verify after entering valid information
  Background: User fills out the register form
    Given User goes to the "https://qa-test.hypnotes.net/register"
    When user types "bunyamin purkaya" to the fullname input
    When user types "bunyamin@mailinator.com" to the email input
    When user types "P@55w0rd" to the password input
    Then user verifies the signup button is clickable

  Scenario: As a user I should be able to verify after entering valid information
    Given user verifies that verification email is in the inbox
    Then user verifies ""Verify Mail"" is clikable
    Then user verifies login page is visible"
    Then user verifies ''Your email has been suucesfully verified. Please login.'' is visible