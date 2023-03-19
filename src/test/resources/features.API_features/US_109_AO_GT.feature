@API
@US_109
Feature: user should be able to contact to Urbanic Farm

  Scenario:TC-001
    Given user connects to the "account/event/getMyEvents" with token
    Then user verifies the success message
    Then user verifies all titles are as follows
      | Matisse |
      | Bernini |
      | Seurat  |
      | Bernini |
      | ozbek   |

    Then user verifies attendee limit for each event are as follows
      | 15 |
      | 20 |
      | 12 |
      | 10 |
      | 15 |