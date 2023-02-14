Feature: As a user I should be able to access the home page
  Scenario: TC_001
    Given User is on the Urbanic_Farm page
    When User verifies url "https://test.urbanicfarm.com/"
    Then User verifies title and Homepage