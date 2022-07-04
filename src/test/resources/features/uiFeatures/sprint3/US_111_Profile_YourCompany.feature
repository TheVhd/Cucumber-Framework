Feature: Profile Page

Scenario: As a user (Therapist), I should be able to perform various actions in the Profile(Your Company) section

  Given User Navigates to "dashboard/profile"
      When User Open Company details Page
      Then User verifies Company title is clickable
      Then User clicks on the company title
      And User Verifies Add New Company button is visible
      Then User Clicks on Add New Company button
      And User verifies the "Your Logo, Your Company, Company's Address, City, State, Zip, Country(Default US),Company's URL, Company's Phone Number Fields are visible
      And User verifies a Valid logo is loadable
      And User verifies a valid company name is applicable
      And User verifies a valid company address is applicable
      And User Verifies a valid City, State, Zip Should be applicable into the related fields
      And User verifies Country Dropdown menu is functional
      And User verifies A country is selectable from the Dropdown menu
      And User verifies a Valid URL is applicable
      And User verifies a valid company's phone number is applicable into the related field