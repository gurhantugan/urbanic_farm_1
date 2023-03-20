Feature: As a user, I should be able to get all requested products' information.
  Scenario:
    Given User logs in with API for get all Product request
    Given User can get all requested products' information
    Then user verifies the all requested product status code is 200
    Then user verifies the all requested product response