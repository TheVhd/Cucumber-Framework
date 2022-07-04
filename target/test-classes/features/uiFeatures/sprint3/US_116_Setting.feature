#US_116_As a user, I should be able to perform various actions on the Settings(Scheduler Page Settings) page.
#Scheduler Client Settings
#Scheduler Client Settings button should be functional
#When the user click to Scheduler Client Settings , the Select Client Input dropdown menu should appear
#Select Client Input menu must be active and functional
#Any input-inputs should be selectable from the Select Client Input menu
#Inputs selected from the Select Client Input menu should be visible on the menu
#A Succesfully updated message should be displayed when the user click to Submit button  after creating the required information
  @US116

Feature: As a user, I should be able to perform various actions on the Settings(Scheduler Page Settings) page.
  Background:

    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    When the user accepts the cookies

    Scenario: US_116_TC_001
      Given the user selects on Settings button
      Then  the user verifies that "Scheduler Client Settings" button is visible
      Then the user verifies if Scheduler Client Settings is functional
      Then the user verifies that "Select Client Input" button is visible
      Then the user verifies if Select Client Input is functional
      And the user clicks on select client input
      Then the user verifies any input is selectable
      Then the user verifies selected inputs are visible on the menu
      And  the user clicks on save changes
     # And user verifies "Successfully updated" message is visible
    Then the user verifies if the message appears "Successfully updated"
