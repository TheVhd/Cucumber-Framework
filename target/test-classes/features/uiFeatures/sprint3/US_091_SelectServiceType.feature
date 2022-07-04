  #US091 As a user, I should be able to perform various actions to create an appointment with the  Custom Service - Register Clients options
  #Service Name must be functional and a valid name should be able to enter
  #Price Package Name must be functional and a valid name should be able to enter
  #Duration Package Name must be functional and a valid name should be able to enter
  #Date must be functional and a valid name should be able to enter
  #Time Start must be functional and a valid name should be able to enter
  #Time End must be functional and a valid name should be able to enter
  #Select Service Type
  #Registered Clients option should be able to check
  #Clients dropdown menu should be functional
  #Any client should be selectable from the Clients dropdown menu
  #Do not notify client button should be functional
  #Do not notify client button should be able to check
  #After the necessary actions, the Submit button should be able to click
  #When the user click to Submit button , a message should appear about the meeting being created
  #The message New Meeting Created should appear
    #new meeting created
  @US091HY
  Feature: US_091 As a user, I should be able to perform various actions to create an appointment with the  Custom Service - Register Clients options

    Background:

      Given User go to "hypnotesURL"
      When User click Login Button
      Then User enter "TherapistLoginEmail"
      And User enter password "TherapistLoginPassword"
      Then User click Login Enter Button
      When the user accepts the cookies


    Scenario: US_091_TC_001
      Given the user selects any date on the calendar
      When the user clicks Custom Service
      Then the user Service Name verifies functional
      Then the user verifies if Price is functional
      Then the user verifies if Duration is functional
      Then the user checks if Date is functional
      Then the user verifies if Time Start is functional
      Then the user verifies if Time End is functional
      When the user selects Register Clients Option
      And the user clicks on Clients dropdown
      Then the user verifies if all Clients are in dropdown
      Then the user verifies if any client is selectable
      Then the user verifies that the Notify client button functional
      When the user clicks on Notify client button
      Then the user verifies Submit button is clickable
      When the user clicks on Submit button
      Then the user verifies if the message appears "New Meeting Created"
