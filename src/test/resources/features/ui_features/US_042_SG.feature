@US_042

Feature: Sell-Share-Trade Page

  US:
  As a user, after entering valid information, I should be able to perform various operations on the
  Sale-Pay-Trade page.

  AC:
  Events should be clickable and relevant page should be visible

  Scenario: Events should be clickable and relevant page should be visible

    Given User goes to Home Page
    When User clicks the login link
    Then User enters valid email address
    Then User enters valid password
    Then User clicks the login button
    Then User moves on to Events button
    Then User asserts the event page is displayed