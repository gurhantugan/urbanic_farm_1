@US_001_HA
Feature: US_001_HA
  As a user I should be able to perform various operations on homepage
  Scenario: The "Register Now" heading under the Contribution to the Environment and Society heading should be clickable
    Given user is on homepage
    And user verifies that register now button is clickable
    Then user verifies that relevant page is "https://test.urbanicfarm.com/auth/register"