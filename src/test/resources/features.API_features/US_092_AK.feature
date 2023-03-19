@API092
Feature:As a user, I should be able to change availability for seller delivers the products.

  Scenario:Delivery & Pickup Settings
    Given user logs in with api for product.
    When changes availability for seller to deliver products
    Then user verifies the product add status code is 200.
   
