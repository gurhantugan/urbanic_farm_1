Feature: As a user, I should be able to request a new product.

  Scenario:
    Given User logs in with API for new Product request
    Then User can request for a new product

      | description | YAZ URUNLERI              |
      | relatedHub  | VEGETABLES_AND_FRUITS_HUB |
      | title       | ADORATION TOMATO          |
    And User verifies the request product success code is 200
    And User verifies the request product response

