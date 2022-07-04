#Acceptance Criteria:
#
#Sessions should be clickable and the relevant page should be seen.
#Sessions should be seen on the opened page.
#Details must be clickable
#Clicking on Details should see various details
# Kemal Durgun

Feature:US_058 As a user, I should be able to see that the Sessions button is functional and be able to perform various actions.

  Background: The user is on the Home Page
    Given the user lands on home page
    When the user Therapist the Sign Up Button
    And  the user selects the Therapist option
    Then the user  clicks the login link
    And  the user enters valid Email "therapisthypnotes2020@gmail.com"
    And  the user enters a valid password "Therapist+tayfa2022"
    Then the user clicks the login Button

  Scenario: US_058 As a user, I should be able to see that the Sessions button is functional and be able to perform various actions.

    Given the user is  on the  "dashboard/clients"  should appear on the page that opens.
    And   the user clicking on the Cleints button
    Then  the user should appear on the "View Detail" that opens  And   the user clicks the  "View Detail"
    Then  "Sessions" must be clickable and the relevant page must be visible.
    Then  "Sessions" should appear on the page that opens.
    And   "Details" should be clickable
    Then  clicking on details should see various "Details"