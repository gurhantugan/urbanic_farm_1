Feature: As a user, I should be able to get rates of the seller.

  Scenario: "Account
  User should be able to get rates of the seller.
  https://test.urbanicfarm.com/api/account/feedback/seller/getRates
  Details on the swagger document."
    Given user connects to the "account/feedback/seller/getRates" with payload and token
    And user verifies that the response is expected