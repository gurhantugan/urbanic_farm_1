@API
@US_110
Feature: As a user, I should be able to get user's attendance information.


  Scenario:TC-001 User should be able to get user's attendance information.
    Given user connects to the "account/event/getMyAttendances" with token
    Then user verifies the success message
    Then user verifies some attendance titles are as follows
      | 43 Dragonfruit            |
      | 3 . Passionfruit Festival |
      | 655 Apricots              |
      | 150 . Lychees Festival    |
      | 301 . Apples Festival     |