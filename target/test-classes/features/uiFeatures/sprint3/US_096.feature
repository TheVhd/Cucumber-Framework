Feature: US_096 Create appointments with the Register Services-New Client (Enter Manually) options


  Background: User as a Therapist navigates to calendar-settings page
    Given the user navigates to "/"
    When the user click on login button on the homepage
    And the user types "TherapistLoginEmail" to Email Input on login page
    And the user types "TherapistLoginPassword" to Password Input on login page
    And the user clicks on Login button on login page
    And the user accepts the cookie


  Scenario: US_096_TC_01 The user verifies that Repeat Options dropdown menu should be functional
   When the user clicks on the "Repeat Options" dropdown menu
#   And the user verifies that various options should be visible in the Repeat Options dropdown menu
#   And the user verifies that "Repeat Options" not visible when we select "Does not repeat" option
#   And the user verifies that "Repeat times" drop down menu is visible when we select any option
#   Then the user selects a number from Repeat times dropdown menu