@regression,@smoke
Feature: User should be able to perform various operations

  Scenario: Blog button should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    When The user clicks on Blog button
    Then user should go to relevant page with "https://urbanicfarm.com/blog/"