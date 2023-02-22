Feature: Orders
  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Welcome Page

    Then orders option should be clickable
    When user clicks on orders
    Then Your Orders(Orders List) should be displayed
    When user select any order and click on details button
    Then order details should be displayed
    * order summery and order contents fields should be visible
    When user click on seller page button
    Then seller page button should be functional and clickable
    When user click on seller adress button
    Then seller page should give correct result with view larger map








