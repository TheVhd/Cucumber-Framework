@us42
Feature:After logging in as User (Therapist), I should be able to see the Clients page

  Scenario:Clients should be clickable and relevant page should be visible
    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And  User verifies Client text is visible
    #then User verifies "Client" is clickable
    #Then user clıcks on the "client " clickable