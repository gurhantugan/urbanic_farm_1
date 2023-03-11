Feature: As a user, I should be able to change user information

  Scenario: User should be able to change user information
    Given user logs in with api
    Then  user adds account info
    Then  user updates the account
    Then  user verifies the status code is 200




