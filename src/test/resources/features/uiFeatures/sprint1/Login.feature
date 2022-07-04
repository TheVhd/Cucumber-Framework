
@Login
@hata
Feature:Login

  Scenario: Login as a User
    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "ClientloginEmail"
    And User enter password "ClientLoginPassword"
    Then User click Login Enter Button
    And User closes the page


    Scenario: Login as a Client
      Given User go to "hypnotesURL"
      When User click Login Button
      Then User enter "TherapistLoginEmail"
      And User enter password "TherapistLoginPassword"
      Then User click Login Enter Button
      And User closes the page





