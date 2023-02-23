@US065
Feature: US065
  Scenario:
    Given User goes to Home Page
    When User clicks the login link
    Then User enters valid email address
    Then User enters valid password
    Then User clicks the login button
    When User verifies welcome page is displayed
    Then User verifies a list of sellers under the heading local sellers near you
    And User is able to choose any seller
    Then User verifies Products are listed in separate sections
    Then User verifies Product quantity icons "(+ -)" are clickable
    Then User verifies add to Cart button is clickable
    And user clicks on basket Dropdown avatar
    When User clicks on the add to Cart button and verifies "added to your basket!" success message is displayed
    Then User verifies the product is added to the cart.



