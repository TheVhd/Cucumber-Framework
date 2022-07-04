
@US001
Feature: As a user I should be able to access the home page

  Scenario: TC001 Homepage
    Given User goes the home page
    Then  User   goes the "https://qa-test.hypnotes.net" and verify url

  Scenario: TC002 The home page must be accessible when the URL is entered

    Given User goes the home page
    Then  User goes the home page and verify title

