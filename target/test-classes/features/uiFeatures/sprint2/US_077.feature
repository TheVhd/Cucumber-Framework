#As a user I should be able to add a date to the Invoice field

#Invoice# field must be functional and writable
#Invoice Date must be functional and date selectable
#Due Date must be functional and date selectable

Feature: Client invoice title and date


  Scenario: TC_001

    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And User clicks the client button
    And User clicks View Detail button
    And User clicks invoice
    And User clears the invoice box and sends the title
    And User clicks the invoice date box, clears and sends a date
    And User clicks the due date box, clears and sends a date

