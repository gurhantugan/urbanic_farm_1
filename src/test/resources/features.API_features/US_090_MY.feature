Feature: Changing availability of the pickup from branch

  Scenario: As a user, I should be able to change availability for buyer picks up from branch.
    Given user logs in with api with Seller_1 credentials
    When user posts the request
    Then user verifies the status code is 200