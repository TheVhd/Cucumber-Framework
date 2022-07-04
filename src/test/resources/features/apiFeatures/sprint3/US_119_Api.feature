  #  As a user, I should be able to get details of report.
  #  Dashboard
  #  User needs to be logged in to get response.
  #  https://test.hypnotes.net/api/dashboard/getReport
  #  Details on the swagger document.

    Feature: As a user, I should be able to get details of report.
       Scenario:TC_001
         Given user connects to the "dashboard/getReport" API get
         Then user verifies status code is "200"
         Then user verifies response has mandatory fields
           | dataWeekly |

