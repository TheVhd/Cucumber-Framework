Feature: Settings (Scheduler Page Settings)

  Scenario: As a user, I should be able to perform various actions on the Settings(Scheduler Page Settings) page.

    Given User Goes to "dashboard/settings"
    When User Clicks Scheduler Page Settings button
    Then User verifies The Settings Button is clickable
    And User Verifies the Categories are clickable
    Then User Click the Categories Button
    And User Verifies the Color palette window is opened
    And User verifies "would you like to add a BG image?" button is visible
    And User verifies "would you like to add a BG image?" button is clickable
    And User verifies the BG changes successfully