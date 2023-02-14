@US012
@smoke
Feature: US_012 User should be able to perform various operations on homepage

  Scenario: TC_001 Discover Local Sellers Near You should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    Then user verifies that SELL, SHARE, TRADE buttons are clickable in the Sell Your Products area
    When user clicks on SELL, SHARE, TRADE buttons then verifies that relevant pages are opened
      | SELL  | https://test.urbanicfarm.com/auth/register |
      | SHARE | https://test.urbanicfarm.com/auth/register |
      | TRADE | https://test.urbanicfarm.com/auth/register |
