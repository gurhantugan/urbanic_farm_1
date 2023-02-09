@US_046

Feature: Home Page

  US:
  As a user, after entering valid information, I should be able to perform various
  operations on the Sale-Pay-Trade page.

  AC:
  Cart should be clickable and relevant page should be visible

  Scenario: Cart should be clickable and relevant page should be visible

    Given User goes to Home Page
    When User clicks the login link
    Then User enters valid email address
    Then User enters valid password
    Then User clicks the login button
    Then User checks the cart button is clickable
    Then User clicks the cart button
    Then Cart page opens