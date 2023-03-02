
Feature: Various actions in adress section

  Background:
    Given user goes to "account/address" page after login
    And user clicks on My Sales Adress

  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Address section
    When user clicks to edit button
    Then user is able to click Submit button and gets the message
    When user clicks to edit button
    Then user clicks the checkbox Mark as a sales address
    And  user is able to click Submit button and gets the message
    Then user sees the "You haven't set your sales address yet. Please select one from your non-selected addresses."

  Scenario: As a user I should be able to use cancel button on My Sales Adress
    When user clicks to edit button
    Then user clicks the checkbox Mark as a sales address
    Then  user clicks on Cancel button
    Then user clicks on Edit button
    And user sees the editted part has not changed
    Then user clicks on Cancel button

  Scenario: As a user I should be able to get alert when I want to edit invalid post code
    When user clicks to edit button
    And user clicks on postcode box and clean it
    And user writes invalid postcode as "456" to box
    Then user clicks on Submit button
    Then user gets the "Please enter a valid postal/zip code." message













