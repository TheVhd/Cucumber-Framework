
Feature: Update in Session

@Cookie



  Scenario: TC_001 Note updated message
    Given user goes to "dashboard/client/41/sessions" with cookie
    And User clicks the Key Points text box
    And User sends the text "Murat Irmak"
    Then User verifies the Note updated toast message appears
    And User clicks After thought text box
    And User sends the text "Murat Irmak" into the After thought text box
    Then User verifies the After thought updated toast message appears
    And User clicks suggestions text box
    And User sends the text "Murat Irmak" into the suggestions text box
    Then User verifies the suggestions updated toast message appears