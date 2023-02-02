@US_028
Feature: Home Page

  US:
  User should be able to perform various operations on homepage

  AC:
  LinkedIn icon should be clickable and relevant page should be visible

  Scenario: LinkedIn icon should be clickable and relevant page should be visible

    Given User is on home page
    When User scrolls down on the home page
    Then User checks the LinkedIn button is clickable
    Then User clicks the LinkedIn button
    Then LinkedIn page opens