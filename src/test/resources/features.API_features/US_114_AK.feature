
Feature: As a user, I should be able to check order status

  Scenario:
    Given user logs in with api order..
    #And user creates Address.
    #And user creates Event.
    And user checks order
    Then User verifies success message is true abd
    Then User verifies if status code is 200 on Event abd