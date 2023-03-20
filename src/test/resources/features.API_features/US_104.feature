Feature: As a user, I should be able to get all orders.
  Scenario:
    Given The user connects to the "string" api
    And The user connects to the getMyBuys api
    And The user verifies seller ids numbers more than one
    And The user verifies that the status code is 200


