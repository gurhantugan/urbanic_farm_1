Feature: As a user, I should be able to delete a product

  Scenario:
    Given user logs in with api for product
    Given usser adds a product
    Then user verifies the product add status code is 200
    Then user deletes a product
    Then user verifies product delete the status code 200