Feature: US_061

  Background:
    Given user goes to "account/orders" page after the login
    And user clicks on My Sales Adress
    When user clicks to edit button
    Then user clicks the checkbox Mark as a sales address
    Then user sees the "You haven't set your sales address yet. Please select one from your non-selected addresses."
    #Then user clicks the checkbox Mark as a delivery address
    And  user is able to click Submit button and gets the message

  @61
  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Orderds section

    Then user asserts orders button is clickable
    Then user clicks the orders button on left column
    Then your Orders page opens
    Then your Orders(Orders List) page should displayed
    Then user clicks rate the product icon
    Then user clicks rate the seller button


    # Orders
 # Orders option should be clickable
 # Clicking on Orders should display the Your Orders(Orders List) page.
 # Any order must be selected
 # Various content related to the order should be seen in the Order Quick Overview field.
 # Product Name, Price, Stock, Unit, Image should be seen
 # Rate the product icon must be functional
 # Rate the product, Rate The Seller buttons should be clickable
 # the Rate the product, Rate The Seller buttons are clicked, various actions should be performed on the screen that opens.

