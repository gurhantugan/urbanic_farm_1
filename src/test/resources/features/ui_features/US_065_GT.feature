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



 #Welcome Page-Orders
 # A list of sellers should appear under the heading Local sellers near you.
 # Any seller should be able to choose
 # Products should be seen listed in separate sections
 # Product quantity icons (+ -) must be functional
 # Add to Cart button must be functional
#the Add to Cart button is clicked, the product should be added to the cart.
# ..... added to your basket! warning should appear
