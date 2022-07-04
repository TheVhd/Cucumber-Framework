@smoke
@US032 @GoToClient
Feature: As a user I should be able to see different options in Sign Up


Background: US_032_TC001_TC002_TC003
  Given User go to "hypnotesURL"
  When User click SignUp Button



  Scenario: US_032_TC001_If 'Sign up as a client?', 'Client Register' should be click

    Then Client verifies the titles are visible


    Scenario: US_032_TC002_After clicking "Client Register", 'https://qa-test.hypnotes.net/register/client ' page should be appear

      Then Client verifies Client Register is clickable


  Scenario: US_032_TC_003_After clicking "Client Register", 'https://qa-test.hypnotes.net/register/client ' page should be appear

    When Client clicks on the Client Register link
    Then Client verifies the url is "https://qa-test.hypnotes.net/register/client"
