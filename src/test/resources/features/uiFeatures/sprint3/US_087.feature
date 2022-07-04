#As a user, I should be able to perform various actions to create an appointment with the Register Services - Register Clients options

#Repeat Options dropdown menu should be functional
#Various options should appear in the Repeat Options dropdown menu
#Any option should be selectable in the Repeat Options section
#The repeat option should not appear when Does not repeat is selected
#Repeat times drop down menu should be visible when any of the Daily, Weekly, Monthly options are selected in the Repeat Options section
#A number should be selectable from the Repeat times dropdown menu

Feature: Appointment with register services
  Background:
    Given user goes to "dashboard/calendar" with the cookie
    And user accepts cookies
    And user clicks the selected date
    And user clicks the repeat options box

  Scenario: TC_001 Drop-down functional various options are selectable in repeat option
    Then user verifies when does not repeat options selected repeat times does not appear
    Then user verifies obtions are enabled
      | Daily    |
      | Weekly   |
      | BiWeekly |
      | Monthly  |

    And user clicks weekly

    Scenario: TC: 002 A number should be selectable from the Repeat times menu

      And user clicks the monthly option box
      And user clicks the Repeat Options UP arrow
      And user clicks the BiWeekly option box
      And user clicks the Repeat Options DOWN arrow
