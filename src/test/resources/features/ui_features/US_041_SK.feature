Feature: As a user, after entering valid information, I should be able to perform various operations on the Sale-Pay-Trade page.
  Scenario: TC001
    Given User goes to Home Page
    When User clicks the login link
    And User enters valid email address
    And User enters valid password
    And User clicks the login button
    When User clicks the Scheduled delivery button
    Then user should go to relevant page  "https://test.urbanicfarm.com/account/weekly-order"