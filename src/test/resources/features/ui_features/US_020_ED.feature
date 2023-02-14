Feature: US020

  Scenario: User should be able to perform various operations on homepage

    Given User is on the Urbanic_Farm page
    And  User clickable the About Us button
    Then user should go to relevant page with "https://test.urbanicfarm.com/about"


