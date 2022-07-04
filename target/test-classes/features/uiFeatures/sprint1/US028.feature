@smoke
@cihan @wip
Feature:US_28

  Background:
    Given User go to "hypnotesURL"
    And User select Therapist form SignUp drop down
    And user clicks full name box and provides full name

  Scenario: TC_01


    And user clicks email box and provides  email
    And user clicks password provides password
    And user accept cookies
   Then user assert verify your email is visible

  Scenario: TC_02
    And user clicks email box and provides invalid  email
    And user clicks password provides password
    Then user verifies the message of please enter a valid email is visible