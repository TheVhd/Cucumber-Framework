@US_112_YourCompany
Feature:US_112 As a user (Therapist),I should be able to perform various actions in the Profile(Specialties & Certifications) section

  Background:
    Given User goes to the "https://test.hypnotes.net/login" nag
    When user types "therapisthypnotes2020@gmail.com" to the email input on the login page.nag
    When user types "Therapist+tayfa2022" to the password input on the login page.nagi


  Scenario:US_112_TC_001 As a user (Therapist),I should be able to perform various actions in the Profile(Specialties & Certifications) section

    Given User clicks the Profile link.nag
    Then  User verifies the company title is clickable and clicks the your company button.nag
    Then  User verifies  the previously attached company informations are visible.nag
    Then  User clicks the Edit Button.nag
    Then  User verifies the Edit your company information page is visible.nag
    Then  User inputs the current company name in the Your Company name field.nag
    Then  User inputs the current Address in the Address field.nag
    Then  User inputs the city, State, Zip code in the city, State, Zip code field.nag
    Then  User inputs the current Country in the Country field.nag
    Then  User inputs the current Companys URL in the Company's URL field.nag
    Then  User inputs the current  Companys Phone Number in the  Company's Phone Number field.nag
    Then  User replaces the current image in the image field.nag
    Then  User verifies Your Company information has been updated text is visible.nag



#"https://test.hypnotes.net/dashboard/profile"
#Acceptance Criteria:
#Your Company
#
#Your Company title must be clickable
#
#When the user enters the page, the previously attached company information should be visible
#
#When the user clicks the Edit button, the Edit your company information page should be displayed
#
#The Your Company field should be able to  update with the current company name
#
#The Company's Address field should be able to  update with the current Company's Address
#
#The city, State, Zip field should be able to  update with the current City, State, Zip
#
#The Country field should be able to  update with the current Country
#
#The Company's URL field should be able to  update with the current Company's URL
#
#The Company's Phone Number field should be able to  update with the current Company's Phone Number
#
#The image in the Image field should be able to  replace with the current image
#
#Your Company information has been updated