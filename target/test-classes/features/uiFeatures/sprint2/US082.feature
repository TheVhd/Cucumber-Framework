@US082
Feature: US_082 As a user, I should be able to create Package in Add New Individual Sessions


  Background:
    Given User lands Login Page "https://test.hypnotes.net/login".NA
    And   User enters a valid email.NA
    When  User enters a valid password.NA
    And   User is on the Dashboard-Calender Page  "https://test.hypnotes.net/dashboard/calendar".NA
    Then  User is on the Dashboard-Services Page "https://test.hypnotes.net/dashboard/services".NA
    And   User clicks on the packages field.NA
    Then  User verifies the Add New Package field is visible and clickable.NA


  @CreateNewPackage
  Scenario: US082_TC001  Create a new Package
    Given   User verifies PackageName Label is visible.NA
    When   User verifies the PackageName Box has a text "Please enter a name" by default.NA
    And    User verifies PackageName Box is writable.NA
    And    User should be able to enter a valid name in the PackageName Box.NA
    And    User verifies Price Label is visible.NA
    And    User verifies the Price Box has a text "$ " by default.NA
    When   User should be able to enter a valid price in the Price Box.NA
    And    User verifies show prices scheduler button movable.NA
    And    User should be see each time options when clicks on Duration drop-down menu.NA
    And    User verifies the time options are visible.NA
    And    User selects only one Duration in the Duration drop-down menu.NA
    And    User verifies Duration drop-down menu is selectable.NA
    And    User verifies Block Extra Time Name button is visible.NA
    And    User verifies Block Extra Time button is movable.NA
    And    User verifies  Block Time Before Appointment (min) field and Block Time After Appointment (min) field are visible.NA
    And    User verifies  Block Time Before Appointment (min) field  Block Time After Appointment (min) field are enterable.NA
    Then   User enters a valid time "20" block before and after buttons.NA
    Then   User checks rightmost buttons are functional.NA
    And    User verifies Payment Required button is movable and User clicks Payment Button.NA
    And    User verifies that Bookable button is visible and movable.NA
    And    User clicks  Bookable button.NA
    And    User sees and verifies "Document Needs To Signed" and "All Documents" texts are visible and clicks on All documents Button.NA
    When   User verifies Total Sessions field is visible and enterable.NA
    And    User types a valid time on the Total Sessions Button.NA
    When   User verifies  Session Interval (Weeks) field  is visible and enterable.NA
    And    User enters a valid number on the Session Interval (Weeks) field.NA
    And    User verifies Package Description field  is visible and enterable.NA
    And    User writes any notes in the Package Description.NA
    Then   User verifies save button  is visible and clickable.NA
    Then   User clicks the save button.NA
    Then   User verifies the "Trail Package (For 1 Month $500)" new package is visible on the available packages section.NA


  @CancelandGenerate
  Scenario: US082_TC002 Cancel Button and Url Generate Url
    Given  User verifies Cancel button  is visible and clickable.NA
    When   User sees and verifies the Packages page is visible after clicking cancel button.NA
    And    User clicks  on the "Generate Scheduler URL" button.NA


  @WarningCasesNegatifTest
  Scenario: US082_TC003 When the user left blank all or one  field ,Warning texts  should be displayed.
    Given user clicks save button after left blanks.NA
    Then user verifies the  PageName "Please enter category name"  Warning is visible.NA
    Then user verifies the  Price "Please enter price"  Warning is visible.NA
    Then user verifies the Duration "Please select or enter a duration" Warning is visible.NA
    Then user verifies the Total Session " Please enter total session"  Warning is visible.NA
    Then user verifies the Interval Session "Please enter session interval"  Warning is visible.NA
    Then user verifies the  Description Session  "Please enter package description"  Warning is visible.NA