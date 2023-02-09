Feature: User should be able to perform various operations on homepage
  Scenario: TC001
    Given user is on the Urbanic_Farm page
    Then user verifies (Backyard gardeners and farmers join the Movement For Free!) that register now button is clickable
    Then user verifies that page is "https://test.urbanicfarm.com/auth/register"