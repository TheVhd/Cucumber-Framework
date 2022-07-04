@login @therapist @ezra @US035
#added hypnotesTestUrl to configuration.properties!!!

Feature:US035 - Must be able to login with a registered Google account

  Scenario:TC01 - log in with Google as a therapist
    Given user goes to "hypnotesTestUrl"
    And user clicks on the login button
    Then user clicks on the Google login icon
    Then user enters email address for Google
    And user enters password for Google
    And user verifies current URL is "therapistLogin"
    Then user closes the page