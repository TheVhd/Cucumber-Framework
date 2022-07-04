@login @therapist @ezra @US036

Feature:US036 - Must be able to login with a registered Facebook account

  Scenario:TC01 - log in with Facebook as a therapist
    Given user goes to "hypnotesTestUrl"
    And user clicks on the login button
    Then user clicks on the Facebook login icon
    Then user enters an email address for Facebook
    And user enters a password for Facebook
    And user verifies current URL is "therapistLoginFb"
    Then user closes the page