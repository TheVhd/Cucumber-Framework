Feature: Profile Page
Scenario: As a user, I should be able to add speciality.

  When User sends a POST Request to "/profile/addSpeciality" api
    | speciality |
    | Trauma     |
  Then user verifies Response is 200
  And User verifies the api response has mandatory fields
    | success    |
    | speciality |