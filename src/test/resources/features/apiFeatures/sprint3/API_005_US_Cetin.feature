
Feature: US005_Api
  As a user, I should be able to update a coupon.

  Scenario: TC_001 Delete coupon

    Given user connect to the "promoCode/deleteCoupon" API
      |couponId|
      |   79  |

    Then user verifies status code is "200"