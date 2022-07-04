@ezra @US_107 @profile @therapist
Feature: US_107

  Background:
    Given user goes to "loginTestUrl"
    Then user enters "TherapistLoginEmail" to "email" box
    Then user enters "TherapistLoginPassword" to "password" box
    And user clicks on login button
    When user accepts cookies
    Then user clicks on Profile

  Scenario: TC_001 education headings
    When user clicks on "Add New Education" span
    And user verifies "Create a new Education" is visible text
    Then user verifies headings are visible
      | School Name | Department | Start Date | End Date | Description |
    Then user verifies headings are functional
      | School Name | Department | Start Date | End Date | Description |

  Scenario: TC_002 education input
    When user clicks on "Add New Education" span
    Then user verifies input boxes are visible
      | schoolName | department | startedAt | enddedAt | description |
    Then user verifies input boxes are functional
      | schoolName | department | startedAt | enddedAt | description |

  Scenario: TC_003 education cancel button
    When user clicks on "Add New Education" span
    And user verifies "Cancel" is visible span
    Then user verifies "Cancel" is functional span
    Then user clicks on "Cancel" span
    Then user verifies "Save" is not visible span

  Scenario: TC_004 education save button
    When user clicks on "Add New Education" span
    And user verifies "Save" is visible span
    Then user verifies "Save" is functional span

  Scenario Outline: TC_005 education positive testing
    When user clicks on "Add New Education" span
    Then user enters "<schoolName>","<department>","<startedAt>", "<enddedAt>", "<description>" in education section
    Then user clicks on "Save" span
    And user verifies the created education is visible
    And user verifies "Education is added" message is visible
    And user deletes the created education
    And user verifies "Education is deleted" message is visible
    Examples:
      | schoolName | department | startedAt  | enddedAt   | description |
      | mentalTeam | QA tester  | 01/01/2022 | 06/05/2022 | description |

  Scenario Outline: TC_006 education negative testing
    When user clicks on "Add New Education" span
    Then user enters "<schoolName>","<department>","<startedAt>", "<enddedAt>", "<description>" in education section
    Then user clicks on "Save" span
    And user verifies "<warning>" warning is visible
    Examples:
      | schoolName | department | startedAt  | enddedAt   | description | warning                      |
      |            | QA tester  | 01/01/2022 | 06/05/2022 | description | Please enter School name     |
      | mentalTeam |            | 01/01/2022 | 06/05/2022 | description | Please enter Department name |
      | mentalTeam | QA tester  |            | 06/05/2022 | description | Please select Start Date     |
