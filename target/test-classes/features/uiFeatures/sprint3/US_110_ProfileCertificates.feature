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

  Scenario: TC_001 certificate page
    Then user verifies "Add New Certificate" is visible span
    And user verifies "Add New Certificate" is functional span
    Then user clicks on "Add New Certificate" span
    And user verifies "Add license or certification" is visible text
    Then user verifies headings are visible
      | Title | Issuing Organization | Issue Date | Credential URL |
    Then user verifies headings are functional
      | Title | Issuing Organization | Issue Date | Credential URL |

  Scenario: TC_002 certificate input
    When user clicks on "Add New Certificate" span
    Then user verifies input boxes are visible
      | title | organization | date | publicUrl |
    Then user verifies input boxes are functional
      | title | organization | date | publicUrl |

  Scenario: TC_003 certificate cancel button
    When user clicks on "Add New Certificate" span
    And user verifies "Cancel" is visible span
    Then user verifies "Cancel" is functional span
    Then user clicks on "Cancel" span
    Then user verifies "Save" is not visible span

  Scenario: TC_004 certificate save button
    When user clicks on "Add New Certificate" span
    And user verifies "Save" is visible span
    Then user verifies "Save" is functional span

  Scenario Outline: TC_005 certificate positive testing
    When user clicks on "Add New Certificate" span
    Then user enters "<title>", "<organization>", "<date>", "<publicUrl>" in certificates section
    Then user clicks on "Save" span
    And user verifies the created certificate is visible
    And user verifies "Certificate is added" message is visible
    And user deletes the created certificate
    And user verifies "Certificate is deleted" message is visible
    Examples:
      | title      | organization | date       | publicUrl  |
      | mentalTeam | QA tester    | 01/01/2022 | 06/05/2022 |

  Scenario Outline: TC_006 certificate negative testing
    When user clicks on "Add New Certificate" span
    Then user enters "<title>", "<organization>", "<date>", "<publicUrl>" in certificates section
    Then user clicks on "Save" span
    And user verifies "<warning>" warning is visible
    Examples:
      | title      | organization | date       | publicUrl  | warning                           |
      |            | QA tester    | 01/01/2022 | 06/05/2022 | Please enter title                |
      | mentalTeam |              | 01/01/2022 | 06/05/2022 | Please enter Issuing Organization |
      | mentalTeam | QA tester    |            | 06/05/2022 | Please select Issue Date          |
