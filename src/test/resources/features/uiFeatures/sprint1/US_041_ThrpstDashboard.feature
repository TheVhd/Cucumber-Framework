@us41
Feature: After logging in as User Therapist I should be able to see the Dashboard page


  Scenario:TC_041 Dashboard should be clickable and relevant page should be visible
    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And  User verifies Dashboard text is visible
    Then User verifies Dashboard is clickable