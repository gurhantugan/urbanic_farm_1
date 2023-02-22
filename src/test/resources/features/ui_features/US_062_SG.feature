@US_062

Feature: Orders

  US:
  As a user, after entering valid information, I should be able to perform various actions in the Orders section

  AC:
  #Orders option should be clickable
  #Clicking on Orders should display the Your Orders(Orders List) page.
  #Any order must be selected
  #The view order details button must be functional.
  #when the View order details button is clicked, the Order Details page should be displayed.
  #The Order summary and Order contents fields should be visible on the Order Details page.
  #Seller page button should be functional
  #Seller page should redirect to correct page when clicked
  #Seller address button should be functional
  #Seller page view should give correct result with larger map
  Background:
    #Given User goes to Home Page
    #When User clicks the login link
    #Then User enters valid email address
    #Then User enters valid password
    #Then User clicks the login button
    #Then User clicks the account home button
    Given user goes to "account/home" page after login as buyer
    Then user asserts orders button is clickable
    Then user clicks the orders button on left column
    Then your Orders page opens
    Then your Orders(Orders List) page should displayed
      | Adoration Tomato    |
      | Gourd Speckled Swan |
      | Butter              |
    Then view order details button must be functional
    Then user clicks on view order details button
    Then order Details page should be displayed
    Then order summary and Order contents fields should be visible on the Order Details page

  @US_062-TC001
    Scenario: Seller Page is functional

    Then seller page button should be functional
    Then user clicks seller page
    Then seller page should redirect to correct page

  @US_062-TC002
    Scenario: Seller address is functional

    Then seller address button should be functional
    Then seller page view should give correct result with larger map
