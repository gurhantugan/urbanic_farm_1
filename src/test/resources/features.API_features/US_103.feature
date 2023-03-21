Feature: As a user, I should be able to get basket details.

  Scenario:
    Given The user connects to the "string" api
    Then user connects to the getBasketDetails
    And user verifies that the status code is 200