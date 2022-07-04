#Acceptance Criteria:
#Meetings should be clickable and the relevant page should be appear
#Created meetings must be visible
#Go to Meeting, Go to Meeting with Bio-feedback buttons should be visible
#Go to Meeting, Go to Meeting with Bio-feedback buttons should be functional
# Bunyamin
Feature: US_060 As a user, I should be able to see that the Meetings button is functional and be able to perform various actions.

Scenario: US_060 As a user, I should be able to see that the Meetings button is functional and be able to perform various actions.
  Given The user goes to "https://test.hypnotes.net"
  Then the user  clicks the "login" button
  And  the user enters valid Email "therapisthypnotes2020@gmail.com"
  And  the user enters a valid password "Therapist+tayfa2022"
  Then the user clicks the "login" button
  And User should click on "clients" tab
  Then user should go to a client and click
  Then user should scroll down
  And User should go to meetings button
  And meeting button should be clickable
  When User clicks on meetings button
  Then meetings should be appear
  When User click meetings button
  Then "Go to Meeting" and  "Go to Meeting with Bio-feedback" buttons should be visible
  When User click meetings button
  Then "Go to Meeting" and "Go to Meeting with Bio-feedback" buttons should be enabled


