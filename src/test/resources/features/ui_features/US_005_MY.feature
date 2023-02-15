
@regression @UI @US_005
Feature: User should be able to perform various operations

Feature: User should be able to perform various operations
@wip
  Scenario: About us should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    When The user clicks on About us
    Then user should go to relevant page with "https://test.urbanicfarm.com/about"


