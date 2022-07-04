Feature: As a user, I should be able get calendar details.

  Scenario:API_011_US129 As a user, I should be able get calendar details.
    Given  User connects to the"/settings/meeting/get".BP
      |    |
      |    |
    And    User verifies status code is "200".BP
    Then   User verifies the api response has mandatory fields.BP
      |  id         |
      | datetime    |
      | date        |
      |timezone_type|
      |timezone     |
      |meetUrl      |
      |subject      |
      |message      |