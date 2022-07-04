@ezra @US_108 @therapist @profile
Feature:

  Background:
    Given user goes to "loginTestUrl"
    Then user enters "TherapistLoginEmail" to "email" box
    Then user enters "TherapistLoginPassword" to "password" box
    And user clicks on login button
    When user accepts cookies
    Then user clicks on Profile
    When user clicks on "Specialties & Certifications" text

  Scenario: TC_001 specialty page
    Then user verifies "Add New Specialty" is visible span
    And user verifies "Add New Specialty" is functional span
    Then user clicks on "Add New Specialty" span
    And user verifies "Create a new collection" is visible text

  Scenario: TC_002 specialty cancel button
    When user clicks on "Add New Specialty" span
    And user verifies "Cancel" is visible span
    Then user verifies "Cancel" is functional span
    Then user clicks on "Cancel" span
    Then user verifies "Create" is not visible span

  Scenario: TC_003 specialty save button
    When user clicks on "Add New Specialty" span
    And user verifies "Create" is visible span
    Then user verifies "Create" is functional span

  Scenario: TC_004 specialty positive test
    When user clicks on "Add New Specialty" span
    When user clicks on specialty dropdown
    Then user verifies all specialties are visible and selectable
    And user selects any specialty
    Then user clicks on "Create" span
    And user verifies "Specialties is added" message is visible
    And user verifies the created specialty is visible
    Then user clicks on the close button
    And user deletes the created specialty
    And user verifies "Speciality is deleted" message is visible

    Scenario: TC_005 specialty negative test
      When user clicks on "Add New Specialty" span
      Then user clicks on "Create" span
      And user verifies "Please input the name of specialte!" warning is visible
