@us43
  Feature: After logging in as User (Therapist), I should be able to see the Add Client page

    Scenario: Add Client should be clickable and relevant page should be visible
      Given User go to "hypnotesURL"
      When User click Login Button
      Then User enter "TherapistLoginEmail"
      And User enter password "TherapistLoginPassword"
      Then User click Login Enter Button
      And  User verifies AddClient text is visible
      Then User verifies AddClient is clickable