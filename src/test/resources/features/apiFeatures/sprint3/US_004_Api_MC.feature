
#As a user, I should be able to update a coupon.

Feature: As a user, I should be able to update a coupon

  Scenario: TC_001 Update coupon
    Given user connects to the "promoCode/update" API
    |promoCode|couponId|
    |MrCihan  |   56   |

    Then user verifies status code is "200"