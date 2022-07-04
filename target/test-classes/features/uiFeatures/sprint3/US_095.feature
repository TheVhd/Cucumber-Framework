Feature: As a user, I should be able to create appointments with the Register Services-New Client (Enter Manually) options

   Scenario: TC_001 Problem created must match the information entered
    Given User Goes to Calendar "dashboard/calendar"
    When User Clicks a day from the calendar
    Then User Verifies the "Book an Appointment" Page Opened
    And User Verifies "Registered Services" is visible
    And User Verifies "Service" Dropdown menu is is visible
    And User verifies the registered services in the DD menu
    Then User clicks on the location DDown menu
    And user verifies the multiple locations in the DDown menu
    And User verifies a location is clickable




