Feature: US_043 HA
  As a user, after entering valid information,
  I should be able to perform various operations on the Sale-Pay-Trade page.
  Scenario: Username should be clickable and relevant page should be visible
    Given user is on homepage
    And user verifies that sell-share-trade button is clickable at the footer part
    And user enter the Login button
    And user should able to see relevant email and password page
    And user enters "huseyinaka01@gmail.com" in Email field on Login Page
    And user enters "Apply1453#" in Password field on login Page
    And user clicks on login button