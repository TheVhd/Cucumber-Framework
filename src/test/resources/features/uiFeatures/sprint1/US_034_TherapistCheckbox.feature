@login @therapist @ezra @US034

Feature:US034 - verify if the therapist checkbox is visible and selected

  Scenario:TC01 - test if "I am a therapist?" checkbox is selected on login page
    Given user goes to "hypnotesURL"
    And user clicks on the login button
    Then user verifies the therapist checkbox is visible
    And user verifies the therapist checkbox is selected
    Then user closes the page