Feature: US_001_HA
  As a user I should be able to perform various operations on homepage
  Scenario: The "Register Now" heading under the Contribution to the Environment and Society heading should be clickable
    Given user is on the Registration Page
    And user verifies Register now heading click-ability
    Then user verifies Society heading click-ability