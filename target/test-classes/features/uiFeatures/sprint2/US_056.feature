Feature: US_56 Client info titles and its elements


  Scenario Outline: Client info via Therapist credentials

    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And User clicks the client button
    And User clicks View Detail button
    And user verifies the current url contains"https://test.hypnotes.net/dashboard/client"
    Then user verifies "<text>" button is visible

    Examples:
      |  text                   |
      | Documents               |
      | Edit                    |
      | Client Info             |
      | Get Payment             |
      | Presenting Issue        |
      | Sessions                |
      | Invoice                 |
      | Schedule An Appointment |