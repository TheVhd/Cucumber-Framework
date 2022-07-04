@ezra @therapist @calendar @US_097
Feature:US097

  Background:
    Given user goes to "loginTestUrl"
    Then user enters "TherapistLoginEmail" to "email" box
    Then user enters "TherapistLoginPassword" to "password" box
    And user clicks on login button
    When user accepts cookies
    Then user clicks on a date in calendar page

  Scenario: TC_01 date dropdown
    And user verifies date dropdown menu is functional
    And user clicks on date dropdown
    Then user verifies dates are visible
    And user verifies dates are clickable
    And user clicks on a date in the date dropdown

  Scenario: TC_02
    And user verifies time start dropdown menu is functional
    When user clicks on time start dropdown
    Then user verifies all times are visible
    And user verifies all times are clickable
    Then user clicks on a hour in the time start dropdown
    Then user clicks on a minute in the time start dropdown
    Then user clicks on a period in the time start dropdown

  Scenario: TC_03
    And user verifies "Registered Clients" is visible span
    And user verifies "New Client (Enter Manually)" is visible span
    And user verifies "New Client (Enter Manually)" is functional span
    When user clicks on "New Client (Enter Manually)" span
    Then user verifies "Enter Client Manually" is visible text
    And user verifies headings are visible
      | First Name | Last Name | Phone | Email |
    And user verifies headings are functional
      | First Name | Last Name | Phone | Email |

  Scenario: TC_04
    When user clicks on "New Client (Enter Manually)" span
    Then user verifies input boxes are visible
      | basic_firstName | basic_lastName | basic_phone | basic_email |
    Then user verifies input boxes are functional
      | basic_firstName | basic_lastName | basic_phone | basic_email |

  Scenario Outline: TC_05
    And user clicks on date dropdown
    And user clicks on a date in the date dropdown
    When user clicks on time start dropdown
    Then user clicks on a hour in the time start dropdown
    Then user clicks on a minute in the time start dropdown
    Then user clicks on a period in the time start dropdown
    When user clicks on "New Client (Enter Manually)" span
    Then user enters "<name>", "<lastName>", "<phone>", "<email>" to create new client
    And user verifies submit button is visible
    And user verifies submit button is functional
    And user clicks on submit button
    And user verifies "New Meeting Created" message is visible
    Examples:
      | name  | lastName | phone      | email                  |
      | green | snail    | 1234567890 | greenSnail11@gmail.com |