Feature: As a user, I should be able to see the added issue

  Background:
    #Given User go to "TherapistLogin"
    #When User click Login Button
    #Then User enter "TherapistEmail"
    #And User enter password "Therapistpassword"
    #Then User click Login Enter Button

  Scenario: TC_001 Problem created must match the information entered
    When User navigates to "/dashboard/client"
    And User verifies the Clients name "Can Bartu"
    And User verifies the phone field is displayed
    And User verifies the time zone is displayed

  Scenario: TC_002 After Creating the issue new windonw should appear additional notes, Attachments and Voice notes section must be funtional
    When User navigates to "/dashboard/client"
    When User opens client chart
    Then User navigates to presenting_issue section
    Then User Verifies the additional notes field is visible
    And User Verifies the attachments field is visible
    And Voice notes field is visible
    And User User Clicks on additional notes sections
    And User Adds some notes
    And User Verifies the note added
    And User adds a file
    And User adds a voice message







