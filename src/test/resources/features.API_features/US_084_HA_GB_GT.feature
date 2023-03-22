Feature: As a user, I should be able to get rates of the seller.

  Scenario: "Account
  User should be able to get rates of the seller.
  https://test.urbanicfarm.com/api/account/feedback/seller/getRates
  Details on the swagger document."
    Given user connects to the "account/feedback/seller/getRates" with payload and token2
    And user verifies that the response is expected
      | success                      | true                   |
      | productFeedback[0].rate      | 5                      |
      | productFeedback[0].firstName | mustafa                |
      | productFeedback[0].userEmail | urbanicfarm2@gmail.com |