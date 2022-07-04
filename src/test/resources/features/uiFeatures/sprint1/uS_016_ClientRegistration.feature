Feature: US_016 Client registration info

  Scenario: TC_001 Entering client registration credentials and password


Given user is in the home page
And user clicks the sign up button
And select the client from the drop down menu
Then user verifies the client register page is on
And user clicks name box and provides name
And user clicks surname box and provides surname
And user clicks email box and provides email
And user clicks password box and enters functional password
Then user verifies the alert of verify your email page

    Scenario: TC_002 Name, surname, email and password should not be able to left blank.

      Given user is in the home page
      And user clicks the sign up button
      And select the client from the drop down menu
      And user only provides password leaving the other boxes blanck
      And clicks the sign up button
      Then user verifies the alert please fill out this field