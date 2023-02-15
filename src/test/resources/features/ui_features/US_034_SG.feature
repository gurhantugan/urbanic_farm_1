#As a user I should be able to successfully complete the register after entering valid information
# Register should be clickable after valid information is entered
#After clicking Register, a new page should appear:
#Welcome to Urbanic Farm
#What would you like to do?
#Buy local food
#Sell local food
#Provide servie for gardening
#I will do all  alert should be visible and clickable

Feature: US034

  @US_034
  Scenario: US034_TC001
    Given user is on the Urbanic_Farm page
    When user clicks on Register
    And user fills out the registration form
    And user clicks on Register button
    Then user verifies following elements are visible
      | Welcome to Urbanic Farm!      |
      | What would you like to do?    |
      | Buy local food                |
      | Sell local food               |
      | Provide service for gardening |
      | I will do all                 |
    And user verifies following elements are clickable
      | Buy local food                |
      | Sell local food               |
      | Provide service for gardening |
      | I will do all                 |
    And user verifies Welcome to Urbanic Farm is visible