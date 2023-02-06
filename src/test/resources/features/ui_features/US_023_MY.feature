Feature: User should be able to perform various operations
  @wip1
  Scenario: Terms Of Service should be clickable and relevant page should be visible
    Given user is on the Urbanic_Farm page
    And   user goes to bottom of the page
    When  user clicks on Terms Of Service
    Then  user should go to relevant page with "https://test.urbanicfarm.com/terms-of-service"