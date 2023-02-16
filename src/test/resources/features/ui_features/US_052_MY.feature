Feature: Various actions in adress section

  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Address section
    Given user goes to "account/address" page after login
    And user clicks on My Sales Adress
    When user clicks to edit button
    Then user is able to click Submit button and gets the message
    When user clicks to edit button
    Then user clicks the checkbox Mark as a sales address
    And  user is able to click Submit button and gets the message
    Then user sees the "You haven't set your sales address yet. Please select one from your non-selected addresses."









