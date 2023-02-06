@US_009

Feature: Home Page

  US:
  User should be able to perform various operations on homepage

  AC:
  Get fresh produce should be clickable and relevant page should be visible

  Scenario: Get fresh produce should be clickable and relevant page should be visible

    Given User is on home page
    Then User checks the Get Fresh Produce button is clickable
    Then User clicks the Get Fresh Produce button
    Then User asserts relevant page is open