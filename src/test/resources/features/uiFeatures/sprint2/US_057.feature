@cihan1
Feature: US_057 As a user, I should be able to see that the Presenting Issues button is functional and various actions are possible.

  Background:
    Given user goes to the "https://test.hypnotes.net/login"
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page.us057
    When user types "Therapist+tayfa2022" to the password input on the login page
    When user clicks on the login button on the login page
    And user accept cookies
    When user clicks on the Client link
    When user clicks on the Viev Detail button

  Scenario: TC_001
    Then user verifies the Presenting Issues button is clickable
   When user logs out of the system

  Scenario:  TC_002
    Then user verifies the Presenting Issues button is clickable
    And user can see Generalized Anxiety Disorder link
    And  Social Phobia button can be seen
#    When user logs out of the system
    When Social Phobia button clikable
    And Paranoid Personality Disorder button clikable
#    When user logs out of the system
    And user  can see  Title, Description, Attachment Titles
    When user logs out of the system