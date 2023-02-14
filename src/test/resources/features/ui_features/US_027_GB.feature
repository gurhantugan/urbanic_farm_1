@US_027
Feature: User should be able to perform various operations
  @GB
  Scenario: Facebook icon should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    When The user clicks on Facebook button
    Then user should go to relevant page in the new window "https://www.facebook.com/urbanicfarmstead"