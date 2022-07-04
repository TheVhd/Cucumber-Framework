@ezra @API @US_149 @calendar
Feature: US 149, API API 29

  Scenario: create experience
    Given user connects to the "profile/addExperience" API
      | company       | jobTitle  | startedAt  | enddedAt    | description |
      | interviewPrep | qa tester | May 1 2022 | Jun 30 2022 | therapists  |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | success                |
      | experience             |
      | experience.id          |
      | experience.company     |
      | experience.jobTitle    |
      | experience.startedAt   |
      | experience.enddedAt    |
      | experience.jobTitle    |
      | experience.description |
      | experience.isActive    |

  Scenario: company
    Given user connects to the "profile/addExperience" API
      | company | jobTitle  | startedAt  | enddedAt    | description |
      |         | qa tester | May 1 2022 | Jun 30 2022 | therapists  |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | success |
      | descr   |

  Scenario: job title
    Given user connects to the "profile/addExperience" API
      | company       | jobTitle | startedAt  | enddedAt    | description |
      | interviewPrep |          | May 1 2022 | Jun 30 2022 | therapists  |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | success |
      | descr   |

  Scenario: start date
    Given user connects to the "profile/addExperience" API
      | company       | jobTitle  | startedAt | enddedAt    | description |
      | interviewPrep | qa tester |           | Jun 30 2022 | therapists  |
    Then user verifies status code is 200
    Then user verifies response has mandatory fields
      | success |
      | descr   |

  Scenario: negative scenario
    Given user connects to the "profile/addExperience" API
      | company       | jobTitle  | startedAt | enddedAt | description |
      | interviewPrep | qa tester | aaa       | aaaa     | therapists  |
    Then user verifies status code is 500
