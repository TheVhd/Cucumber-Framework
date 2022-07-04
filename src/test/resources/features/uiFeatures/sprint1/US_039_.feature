@US039 @forgotPassword
Feature: US_039_ As a user Forgot your password? and I should be able to check the new password creation process

  Scenario: TC_001_Forgot your password? Reset should be clickable.

    Given User go to "hypnotesURL"
    When Users click Login Button
    Then Users verifies Reset is clickable

  Scenario: TC_002_When reset is clicked, the "Forgot Password" screen should appear.
      Given User go to "hypnotesURL"
      When Users click Login Button
      Then Users click Reset Button
      And Users verifies the "reset-password" is Forgot Password

  Scenario: TC_003_Forgot Password window should be functional

    Given User go to "hypnotesURL"
    When Users click Login Button
    Then Users click Reset Button
    And Users verifies that the Forgot Password window is reachable

  Scenario: TC_004_"Valid email must be entered in the Forgot Password window.(positive)

    Given User go to "hypnotesURL"
    When Users click Login Button
    Then Users click Reset Button
    And User enters a "MehmetvalidEmail"(positive)

  Scenario Outline: TC_005_"Valid email must be entered in the Forgot Password window.(negative)

    Given User go to "hypnotesURL"
    When Users click Login Button
    Then Users click Reset Button
    And User enters a "<MehmetInvalidEmail>"
    Examples:
      | MehmetInvalidEmail |
      | abc.def@mail.c |
      | abc.def@mail#archive.com |
      | abc.def@mail |
      | abc.def@mail..com |