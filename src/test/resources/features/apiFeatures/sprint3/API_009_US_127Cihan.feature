Feature: API_009_127 As a user, I should be able to get services.


  Scenario: TC_001 Get coupon

    Given user connect to the "settings/meeting/category/get" API
    | |
    | |
     Then user verifies status code is "200"

    Then user verifies response has mandatory fields.api009
    |id|
    |  price|
    |      title|







