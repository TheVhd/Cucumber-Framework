Feature:As a user, I should be able to add Client information to the Invoice field

  Background:
    Given User goes to the "https://test.hypnotes.net/login".us076
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page.us076
    When user types "Therapist+tayfa2022" to the password input on the login page.us076
    When user clicks on the "loginEnterButton" button on the login page

  Scenario:
    When user clicks on the "Clients" button
    When user clicks on a "Client"
    When user clicks on the "Invoice"
    When user inputs name in the name field
    When user inputs a valid address in the address field
    When user inputs city, State, and Zipcode in the City, State, Zip field
    When user checks if Country drop down is functional
    Then user selects a Country from the drop down