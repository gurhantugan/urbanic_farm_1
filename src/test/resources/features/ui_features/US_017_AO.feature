@US017
@smoke
Feature: US_017 User should be able to perform various operations on homepage
  Scenario: TC_001 Discover Local Sellers Near You should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    When user clicks on Discover Local Sellers link
    Then user verifies that relevant page is "https://test.urbanicfarm.com/explore"
