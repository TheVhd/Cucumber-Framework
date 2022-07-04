@ezra @API @US_132 @calendar
Feature: US_132, API_014

  Scenario: TC_001 Create Blocked Time
    Given user connects to the "hypnotherapist/timeoff/create" API
      | isRecurring | title  | recurringDays[0] | startAt | finishAt |
      | true        | Online | tuesday          | 21:30   | 22:45    |
    Then user verifies status code is 200
    And user verifies the api response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.isRecurring   |
      | data.startAt       |
      | data.finishAt      |
      | data.recurringDays |
      | data.specificDate  |
      | data.isAllDay      |
      | data.locationTitle |
