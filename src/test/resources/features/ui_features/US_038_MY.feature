@regression @UI @US_038
Feature: To see the Sell-Pay-Trade page


  Scenario: As a user, after entering valid information, I should be able to see the Sell-Pay-Trade page.
    Given user is on the Urbanic_Farm page
    When user enter the Login button
    And User enters valid email address
    And User enters valid password
    Then User clicks the login button
    And user clicks Sell-Share-Trade button and verifies the relevant page is opening
    Then user checks the following links are displayed on the page
      | About us           |
      | Contact us         |
      | Scheduled delivery |
      | Events             |
      | Logout             |
      | Cart               |

