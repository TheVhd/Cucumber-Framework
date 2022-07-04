Feature:As a user, I should be able to delete the issue

  Background:User navigates to client chart
    Given User navigates to "/dashboard/clients"
    When User navigates to Client page
    And User opens client chart
    # An issue named "To be deleted" should be created manually before the scenario

  Scenario: As a user, I should be able to delete the issue
    When User navigates to presenting_issue section
    Then User picks a client issue
    And User verifies the delete button is enabled
    Then User click Delete Button
    And User verifies the "Yes" "No" Buttons are visible
    When User Clicks on the Yes button
    And Successfully deleted message is displayed








