@US_081 @services @therapist @ezra @TEST_MENTALTEAM-352
Feature: US_081

  Background: log in-choose services
    Given user goes to "loginTestUrl"
    Then user enters "TherapistLoginEmail" to "email" box
    Then user enters "TherapistLoginPassword" to "password" box
    And user clicks on login button
    When user accepts cookies
    Then user clicks on Services

  Scenario: US_081 TC_01 wrapper field is visible
    When user clicks on "Add New Individual Sessions" span
    Then user verifies wrapper field is visible

  Scenario: US_081 TC_02 visibility of the titles
    #Documents need to sign fails if there are no documents  Document Needs To Signed |
    When user clicks on "Add New Individual Sessions" span
    Then user verifies headings are visible
      | Name | Price | Show price on scheduler | Duration | Block Time Before Appointment (min) | Block Time After Appointment (min) | Payment Required | Bookable | Description |

  Scenario: US_081 TC_003 visibility of boxes/checkboxes
    When user clicks on "Add New Individual Sessions" span
    Then user verifies input boxes are visible
      | title | price | duration | blockBefore | blockAfter | description | showPrice | paymentRequired | bookable |

  Scenario: US_081 TC_004 click-ability of boxes/checkboxes
    When user clicks on "Add New Individual Sessions" span
    Then user verifies input boxes are functional
      | title | price | duration | blockBefore | blockAfter | description | showPrice | paymentRequired | bookable |

  Scenario: US_081 TC_05 cancel button
    When user clicks on "Add New Individual Sessions" span
    And user verifies "Cancel" is visible span
    Then user verifies "Cancel" is functional span
    Then user clicks on "Cancel" span
    Then user verifies "Save" is not visible span

  Scenario: US_081 TC_06 save button
    When user clicks on "Add New Individual Sessions" span
    And user verifies "Save" is visible span
    Then user verifies "Save" is functional span

  Scenario: US_081 TC_07 generate scheduler url
    When user clicks on "Generate Scheduler URL" span
    Then user verifies scheduler URL is visible

  Scenario: US_081 TC_08 click-ability of rightmost buttons
    When user clicks on "Add New Individual Sessions" span
    Then user verifies rightmost up button is functional
      | [1] | [2] | [3] |
    Then user verifies rightmost down button is functional
      | [1] | [2] | [3] |

  Scenario: US_081 TC_09 duration dropdown
    When user clicks on "Add New Individual Sessions" span
    Then user clicks on duration box
    And user verifies all durations are selectable
      | 30 | 45 | 60 | 75 | 90 | 115 | 120 | 130 | 145 | 160 |

  Scenario Outline: US_081 TC_10 positive testing
    When user clicks on "Add New Individual Sessions" span
    Then user enters "<name>","<price>" ,"<duration>" ,"<blockBefore>" ,"<blockAfter>" ,"<description>"
    And user checks off all the "<text>"
    And user checks off all documents checkbox
    Then user clicks on "Save" span
    And user verifies the created session is visible
  #  And user verifies "Category is added" message is visible
    And user deletes the created session
    And user verifies "Individual Sessions is deleted" message is visible
    Examples:
      | name   | price | duration | blockBefore | blockAfter | description | text            |
      | mental | 100   | 60       | 5           | 5          | description | paymentRequired |

  Scenario Outline: US_081 TC_11 negative testing
    When user clicks on "Add New Individual Sessions" span
    Then user enters "<name>","<price>" ,"<duration>" ,"<blockBefore>" ,"<blockAfter>" ,"<description>"
    And user checks off all the "<text>"
    And user checks off all documents checkbox
    Then user clicks on "Save" span
    And user verifies "<warning>" warning is visible
    Examples:
      | name | price | duration | blockBefore | blockAfter | description | text                      | warning                           |
      |      | 100   | 1        | 5           | 60         | description | paymentRequired           | Please enter  name                |
      | 5    |       | 5        | 5           | 60         | description | showPrice,paymentRequired | Please enter price                |
      | 5    | 256   |          | 5           | 60         | description | paymentRequired           | Please select or enter a duration |
