@us44
  Feature: After logging in as User (Therapist), I should be able to see the Documents page

    Scenario: Documents should be clickable and relevant page should be visible
      Given User go to "hypnotesURL"
      When User click Login Button
      Then User enter "TherapistLoginEmail"
      And User enter password "TherapistLoginPassword"
      Then User click Login Enter Button
      And  User verifies Documents text is visible
      Then User verifies Documents  is clickable