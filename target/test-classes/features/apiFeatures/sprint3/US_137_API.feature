@ezra @API @US_137 @calendar

Feature: US 137, API 19

  Scenario: Online
    Given user connects to the "hypnotherapist/timeoff-period/all" API
      | title  |
      | Online |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.finishAt      |
      | data.startAt       |
      | data.locationTitle |

  Scenario: Home
    Given user connects to the "hypnotherapist/timeoff-period/all" API
      | title |
      | home  |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.finishAt      |
      | data.startAt       |
      | data.locationTitle |

  Scenario: Ankara
    Given user connects to the "hypnotherapist/timeoff-period/all" API
      | title        |
      | Ankara Adres |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.finishAt      |
      | data.startAt       |
      | data.locationTitle |

  Scenario: Istanbul
    Given user connects to the "hypnotherapist/timeoff-period/all" API
      | title    |
      | Istanbul |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | status             |
      | data               |
      | data.id            |
      | data.finishAt      |
      | data.startAt       |
      | data.locationTitle |
