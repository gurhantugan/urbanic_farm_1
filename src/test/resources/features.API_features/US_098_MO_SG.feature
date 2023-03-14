Feature: As a user, I should be able to add a product to the hub

  Scenario: User should be able to add a product to the hub
    Given user logs in with api for product
    Then  usser adds a product
    Then  user verifies the status code is 200
   Then user verifies that the response is as expectedd
      | success | true                        |
#      | product | VEGETABLES_AND_FRUITS_Basil |










