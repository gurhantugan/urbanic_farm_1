Feature: As a user, I should be able to request a new product.

  Scenario:
    Given user connects to "account/hub/getHubDetails/TREES_HUB" with payload and token
      | description | relatedHub | title          |
      |             | TREES_HUB  | Christmas Tree |
   # Then user asserts that the response is as expected

