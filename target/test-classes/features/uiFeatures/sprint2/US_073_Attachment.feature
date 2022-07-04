
@US073
Feature: US-073 As a user, I should be able to perform various actions in the Attachments section.

  Background:
    Given the user is on the qa home page
    When the user clicks on login button on the homepage
    And the user enters valid credentials
    And the user clicks on login button on login page
    And the user clicks the Clients tab on the Dashboard Calendar Page
    And the user inputs Reyhan into the Search Input Box
    And the user clicks the search button
    And the user clicks the client name
    And the user clicks the Sessions
    And the user clicks the Add New Session button

 # Scenario Outline: US_073_TC_001
    Scenario: US_073_TC_001
    When the user clicks the attachment icon
    Then the user verifies that the attachment icon is enabled
  And the user attaches the file
    Then the user verifies that the file is selected
    Then the user verifies that the warning message "1 images added." is displayed.
    When the user opens the added images by clicking
    Then the user verifies that Copy, Extract text, Send to client, Delete Image buttons are displayed
   # Then the user verifies that "<text>" are displayed
   # Examples:
   #   | text           |
   #   | coppy          |
   #   | Extract text   |
    #  | Send to client |
    #  | Delete Image |
    Then the user verifies that Copy, Extract text, Send to client, Delete Image buttons are enabled
    And the user clicks on Extract text button
    Then the user verify if  textbox is empty
    And the user clicks the "Click to see in a new tab" button
    Then the user verifies that the new file is displayed in the new tab
    When the user clicks on Delete button
    Then the user verifies if attached file is exist
