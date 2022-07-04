@US003
Feature:When I enter the home page as a user, I should be able to see the Try Free, Login headings.


  Scenario: Try it for Free, Sign In headers should appear
    Given User goes the home page
    Then  User verifies Try it for free and Sign in  are visible

  Scenario: TC002 Try it for Free, Sign In headers should appear clickable

    Given User goes the home page
    Then  User verifies the Try it for free and Sign in are clickable
