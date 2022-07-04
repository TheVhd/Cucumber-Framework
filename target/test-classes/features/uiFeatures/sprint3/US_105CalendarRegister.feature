
Feature: US_105 Performing an appointment reschedule
  Background:
    Given user goes to the "/login"

    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page
    When user types "Therapist+tayfa2022" to the password input on the login page
    When user clicks on the login button on the login page
    When user accepts cookies
    And user clicks on the related client button
    And user clicks on the Reschedule Appointment button
    And user clicks on the given date
    And user clicks Confirm Meeting button
    And user clicks the Next button and clicks Submit button

  Scenario: TC_001
    Then user checks if the Successfully created a meeting with  is visible
    Then user verifies close button is functional
    Then user clicks on the Book Another Appointment button
    And user checks if the Book an appointment text is displayed
    Then user clicks on the X button
    And user checks if the Meet Info menu is visible
    Then user clicks on the X button on meet info


