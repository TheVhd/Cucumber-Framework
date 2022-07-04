@US094
Feature: As a user, I should be able to perform various actions to create an appointment with the Custom Service New Client (Enter Manually) options

  Background:
    Given User goes to Hypnotes Page...
    Then  User clicks Login button ..
    And   User enters a valid email in the email input..
    Then  User types a valid password in the password input..
    Then  User is on the Dashboard-Calender Page..
    Given User clicks month view..
    When  User selects a date from the calendar..

	#{{TURL " https://test.hypnotes.net/dashboard/calendar ”}}
  @TEST_MENTALTEAM-518
  @CreateCustomServiceNewClient
  Scenario: US094_TC001 I should be able to perform various actions to create an appointment with the Custom Service New Client
    Given  User sees the Select Service Type field..
    And   User selects the Custom Service..
    And   User verifies Service Name is visible and enterable..
    And   User verifies the Price Box has a text dollar "$ " sign  by default..
    And   User verifies Price is visible and enterable..
    And   User clicks Up-Down rightmost price Buttons and verifies the buttons are clickable..
    When  User selects a minute from Duration field and verifies duration field selectable and enterable..
    When  User verifies Date field is visible,enterable or selectable from the options..
    And   User verifies Time Start is  clickable ,enterable and selectable..
    And   User verifies Time End button is NOT enterable,clickable..
    And   User verifies radio buttons Registered Clients and New Client (Enter Manually) are visible and selectable..
    And   User enters a name  in the firstname field..
    And   User types a last name in the  Last Name input field..
    And   User types a phone number in the Phone input..
    And   User enters an email address in the email input..
    When  User clicks the Submit button..
    Then  User sees New Meeting Created message and verifies..
    Then  User cancels the appointment..

  @TEST_MENTALTEAM-519 #URL=”{{https://test.hypnotes.net/dashboard/calendar”}}
  @NegatifCaseNewMeetingCreated
  Scenario:US094_TC002 User verifies negative case for the new meeting created
    Given    User clicks custom services and on the New Client (Enter Manually)..
    And     User verifies  First name required "First name is required" message..
    And     User verifies Price required "Price is required" message..
    Then    User verifies  Title required "Title is required" message...