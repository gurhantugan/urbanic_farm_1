Feature: US095_TC001 As a user, I should be able to create a hub.

  @US095
  Scenario: User should be able to create a hub.
    Given User logs in as as seller with API
    Then User gets Hub create
   # Then user verifies the status code is 200