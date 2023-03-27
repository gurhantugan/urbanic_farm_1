Feature: Get weekly order list
  Scenario: getting weekly order list from api
    Given user goes to end point and sends the body to get response with the order list endpoint
    Then user asserts that status code and response is list
