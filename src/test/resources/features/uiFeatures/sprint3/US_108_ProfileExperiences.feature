#MENTALTEAM-462  MENTALTEAM-589 MENTALTEAM-607  MENTALTEAM-486
@ezra @US_108 @therapist @profile
Feature:

  Background:
    Given user goes to "loginTestUrl"
    Then user enters "TherapistLoginEmail" to "email" box
    Then user enters "TherapistLoginPassword" to "password" box
    And user clicks on login button
    When user accepts cookies
    Then user clicks on Profile
    When user clicks on "Experiences" text

  Scenario: TC_001 experience page
    Then user verifies "Add New Experience" is visible span
    And user verifies "Add New Experience" is functional span
    Then user clicks on "Add New Experience" span
    And user verifies "Create a new Experience" is visible text
    Then user verifies headings are visible
      | Company Name | Job Title | Start Date | End Date | Description |
    Then user verifies headings are functional
      | Company Name | Job Title | Start Date | End Date | Description |

  Scenario: TC_002 experience input
    When user clicks on "Add New Experience" span
    Then user verifies input boxes are visible
      | company | jobTitle | startedAt | enddedAt | description |
    Then user verifies input boxes are functional
      | company | jobTitle | startedAt | enddedAt | description |

  Scenario: TC_003 experience cancel button
    When user clicks on "Add New Experience" span
    And user verifies "Cancel" is visible span
    Then user verifies "Cancel" is functional span
    Then user clicks on "Cancel" span
    Then user verifies "Save" is not visible span

  Scenario: TC_004 experience save button
    When user clicks on "Add New Experience" span
    And user verifies "Save" is visible span
    Then user verifies "Save" is functional span

  Scenario Outline: TC_005 education positive testing
    When user clicks on "Add New Experience" span
    Then user enters "<company>","<jobTitle>","<startedAt>", "<enddedAt>", "<description>" in experience section
    Then user clicks on "Save" span
    And user verifies the created experience is visible
    And user verifies "Experience is added" message is visible
    And user deletes the created experience
    And user verifies "Experience is deleted" message is visible
    Examples:
      | company    | jobTitle  | startedAt  | enddedAt   | description |
      | mentalTeam | QA tester | 01/01/2022 | 06/05/2022 | description |

  Scenario Outline: TC_006 education negative testing
    When user clicks on "Add New Experience" span
    Then user enters "<company>","<jobTitle>","<startedAt>", "<enddedAt>", "<description>" in experience section
    Then user clicks on "Save" span
    And user verifies "<warning>" warning is visible
    Examples:
      | company    | jobTitle  | startedAt  | enddedAt   | description | warning                   |
      |            | QA tester | 01/01/2022 | 06/05/2022 | description | Please enter Company name |
      | mentalTeam |           | 01/01/2022 | 06/05/2022 | description | Please enter Job Title    |
      | mentalTeam | QA tester |            | 06/05/2022 | description | Please select Start Date  |
      | mentalTeam | QA tester | 01/01/2022 |            | description | Please select End Date    |

