#As a user, I should be able to update in Session

#"Note updated" warning should be seen after Key Points update
#"After Thoughts updated" warning should be seen after After Thoughts update
#Hypnotic techniques and suggestions ''Note updated'' warning should appear

Feature: Update in Session

  Background:

    Given User go to "hypnotesURL"
    When User click Login Button
    Then User enter "TherapistLoginEmail"
    And User enter password "TherapistLoginPassword"
    Then User click Login Enter Button
    And User clicks the client button
    And User clicks View Detail button
    And User clicks session icon

  Scenario: TC_001 Note updated message

    And User clicks the Key Points text box
    And User sends the text "Murat Irmak"
    Then User verifies the Note updated toast message appears

  Scenario: TC_002 After thoughts updated message
    And User clicks After thought text box
    And User sends the text "Murat Irmak" into the After thought text box
    Then User verifies the After thought updated toast message appears


  Scenario: TC_003 suggestions updated message
    And User clicks suggestions text box
    And User sends the text "Murat Irmak" into the suggestions text box
    Then User verifies the suggestions updated toast message appears







