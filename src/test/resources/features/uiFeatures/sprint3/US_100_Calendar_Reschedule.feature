Feature: As a user; I must be able to perform an appointment reschedule

  Background:US_100

    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And Client can see "https://test.hypnotes.net/dashboard/calendar"
    Then Client click Scheduling Button
    And Client click Calendar
    When Client can be see  "'MEHMET test'" in calendar
    Then Client click "'MEHMET test'"
    And Client click Reschedule button

    Scenario:US_100_TC_001_Click the Reschedule button and the Book an appointment screen should appear.

      And Client should be appearing appointment screen

      Scenario:US_100_TC_002_The Hypnotes Scheduler pipeline should be visible
        And Client should be see Schedule pipeline

    Scenario:US_100_TC_003_Appointment, Docs, Confirmation, Details headers should be visible
      And Client should be see Appointment, Docs, Confirmation, Details headers

    Scenario:US_100_TC_004_Service, Locations dropdown menus and Collect Payment button should be visible under the Appointment heading.
      And Client should be see Service, Locations dropdown menus and Collect Payment button




