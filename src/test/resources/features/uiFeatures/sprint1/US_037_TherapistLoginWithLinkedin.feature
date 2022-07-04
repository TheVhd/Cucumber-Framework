@login @therapist @ezra @US037

Feature:US037 - Must be able to login with a registered Linkedin account

  Scenario:TC01 - log in with Linkedin as a therapist
    Given user goes to "hypnotesTestUrl"
    And user clicks on the login button
    Then user clicks on the Linkedin login icon
    Then user enters an email address for Linkedin
    And user enters a password for Linkedin
    And user verifies current URL is "therapistLogin"
    Then user closes the page