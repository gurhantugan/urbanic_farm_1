
Feature: As a user, I should be able to check order status

  Scenario:
    Given user logs in with api.
    #And user creates Address.
    #And user creates Event.
    And kullanıcı siparişi kontrol eder
    Then user verifies success message is true
    Then user verifies if status code is 200 on Event