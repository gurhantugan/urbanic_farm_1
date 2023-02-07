@US_008
Feature: Home Page

  US:
  User should be able to perform various operations on homepage

  AC:
  Register should be clickable and relevant page should be visible

  Scenario:  Register should be clickable and relevant page should be visible

    Given User is on home page
    When User checks the register button is clickable
    Then User clicks the register button
    Then Relevant page opens

