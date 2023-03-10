Feature: Welcome Page-Cart Operations between Seller and Buyer

  Scenario: Buyer and Seller do shopping and sees related links
#sellermathew@gmail.com    Mathew147  buyermary@gmail.com  Mary2583
    Given user goes to "home" page after login as Mary
    When user wants to buy any product from Mathew the Seller
    And user goes to seller page to buy product and clicks add to cart
    And User clicks the cart button
    And user verifies seller name and product name in the cart
    And user clicks proceed to checkout
    And user sees new open pga to pay with paypall and clicks login
    Then user sees "Payment successful" message on the screen
    And user clicks on the notification bell to confirm orders
    And user clicks on the order link in notofications
    And user clicks on the view order details to get orderID
    And user goes to "account/sold-items" page after login as Mathew
    Then seller sees the same orderID on his account
    When seller sees order and changes the status from in progress to on delivery
    And user goes to "home" page after login as Mary
    And user goes to account page and clicks on Orders
    Then user sees the order status on delivery
    And user clicks on the notification bell to confirm orders
    And user clicks on the mark all read button
    Then user sees "No unread notifications" in notifications box
    And user clicks on logout button

    And user goes to "account/sold-items" page after login

    #When user click