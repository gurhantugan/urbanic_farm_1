Feature: User should be able to perform various operations
  @GB
  Scenario: The Go Wefunder button in the Invest in Urbanic Farm header should be clickable
    Given user is on the Urbanic_Farm page
    When The user clicks on button wefunder
    Then user should go to relevant page in the new window "https://wefunder.com/urbanicfarm"