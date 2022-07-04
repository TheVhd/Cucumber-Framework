#Acceptance Criteria:
#
#Documents should be clickable and the relevant page should be seen
# Dokümanlar tıklanabilir olmalı ve ilgili sayfa görülebilmelidir.
#Uploaded Documents, Signed Documents, Invoices should be seen on the page that opens.
# Açılan sayfada Yüklenen Belgeler, İmzalı Belgeler, Faturalar görünmelidir.
#Clicking Uploaded Documents should show the correct result
#Yüklenen Belgeler'e tıklamak doğru sonucu göstermelidir
#Clicking Signed Documents should show the correct result
#İmzalı Belgeler'e tıklamak doğru sonucu göstermelidir
#Clicking Invoices should show the correct result
#Faturalar'a tıklamak doğru sonucu göstermelidir
#  KemalD

Feature:US_059_TC_001 As a user, I should be able to see that the Documents button is functional
  and be able to perform various actions.

  Background: The user is on the Home Page
    Given the user lands on home page
    When the user Therapist the Sign Up Button
    And  the user selects the Therapist option
    Then the user  clicks the login link
    And  the user enters valid Email "therapisthypnotes2020@gmail.com"
    And  the user enters a valid password "Therapist+tayfa2022"
    Then the user clicks the login Button

  Scenario: US_059_TC_001 As a user, I should be able to see that the Documents button is functional
  and be able to perform various actions.

    Given the user is  on the  "dashboard/clients"  should appear on the page that opens.
    And   the user clicking on the Cleints button
    Then  the user should appear on the "View Detail" that opens  And   the user clicks the  "View Detail"
    Then  "Documents" must be clickable and the relevant page must be visible and "Documents" should appear on the page that opens.
    Then  "Uploaded Documents" must be clickable  and the relevant page must be visible.
    Then  "Signed Documents" must be clickable  and the relevant page must be visible.
    Then  "Invoices" must be clickable  and the relevant page must be visible.
    And   "Uploaded Documents" should be  clickable
    And   "Signed Documents" should be  clickable
    And   "Invoices" should be  clickable
    Then  "Invoices"should show the correct result

