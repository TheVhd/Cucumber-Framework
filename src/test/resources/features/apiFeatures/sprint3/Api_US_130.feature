@API_US130
Feature: API_US_130 As a user, I should be able change flexible time meeting.

  Scenario: API_US130_TC001 User should be able change flexible time meeting.

    Given user connects to the "/settings/change/flexibleTimeMeeting" API.na
      |flexibleMeetingTime|
      |true               |
    Then user verifies status code is "200".na
    Then user verifies the api response has mandatory fields.na
      | success |