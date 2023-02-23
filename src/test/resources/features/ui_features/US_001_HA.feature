@regression
@US_001

Feature: US_001_HA
  As a user I should be able to access the home page

    Scenario:The home page must be accessible when the URL is entered https://test.urbanicfarm.com/home
      Given user on the Urbanic Farm page
    Then user verifies that relevant page is "https://test.urbanicfarm.com/"
    And user closes browser
