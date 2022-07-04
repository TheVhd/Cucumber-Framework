Feature:As a user I should be able to successfully complete the register after entering valid information
Background: User fills out the register form
  Given User goes to the "https://qa-test.hypnotes.net/register".us030
  When user types "bunyamin purkaya" to the fullname input.us030
  When user types "buuncdnyamdinnsfdfn@gmail.com" to the email input.us030
  When user types "P@55w0rd" to the password input.us030
  Then user verifies the signup button is clickable

  Scenario: TC_001 Sign Up should be clickable after valid information is entered.
    When user clicks on signup button
    Then the user verifies that the warning message "We have sent an email to" is displayed.us030
    Then User verifies "Did not get the email or it is expired?"
    Then User verifies "If you are not able to verify this email, try to signup with different email."
    Then User verifies Sign Up Button is clickable
    Then User verifies Send again Button is clickable
