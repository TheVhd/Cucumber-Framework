Feature: As a user, I should be able change category colors
  Scenario:TC_001
    Given User connects to "schedule/inCalender/setCategoryColor" By Post method

      | İndividual | Packages | GroupSession | Noshow  | ShowedUp | Reschedule | Canceled |
      | #278AD3    | #2BCFB1  | #00a6ff      | #FFF633 | #2753D3  | #DD33FF    | #10a8ff  |

    Then User verifies the response is 200
    Then User verifies the response has mandatory fields
    |success|