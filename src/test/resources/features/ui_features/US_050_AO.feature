@US_050
Feature: US_050 As a user, after entering valid information, I should be able to perform various actions in the Address section

  Background: : TC_001 As a user, after entering valid information, I should be able to perform various actions in the Address section
    Given user goes to Home Page
    When user clicks on login button header
    And user enters valid email address
    And user enters valid password
    And user clicks on login button footer
    Then user should be on the Home page
    When  User clicks the account home button
    When User clicks the address button on left column
    Then user should be able to on the Address page
    When user clicks on Add New Address button
    And user enters Search Places valid address
    And user clicks on submit button

  @US_050_TC_001
  Scenario: user goes to Address page
    Then the message should be seen"Your Address successfully added"

  @US_050_TC_002
  Scenario: user gets warning message
    Given user on the Address page
    When user clicks on My Sales Address button
    Then user should see warning message "You haven't set your sales address yet. Please select one from your non-selected addresses."

  @US_050_TC_003
  Scenario: user gets updated message
    Given user on the Address page
    When user clicks on Non Selected Address button
    Then Edit button should be clickable
    And Remove button should be clickable
    When user clicks on Edit button
    And user edits the house number
    And user clicks on Submit button
    Then user should be able to see warning message"Your Address successfully updated"

  @US_050_TC_004
  Scenario: Address deleted
    Given user on the Address page
    When user clicks on Remove button
    Then pop up should be seen"Are you sure to delete the address?"
    When user clicks on No button
    Then user should be go back to Address page
    When user clicks on Remove button
    And user clicks on Yes button
    Then user should see the message "Address deleted"






#    Non Selected Address
#    If addresses are added but not selected, "You have not set your sales address yet. Please select one of your unselected addresses." alert will be displayed.
#    In the Unselected Address section, the address editing and deletion buttons should be operational.
#    The address should be corrected with the edit button and the process should be completed with the send button.
#    After clicking Submit, the alert Your address has been successfully updated should appear.
#    Address should be removed with the Revoke option

#    Revoke should be clickable and alert should appear when Revoke is clicked
#    Are you sure you want to delete the address? alert should be displayed.
#    Yes/No options should appear.
#    One of the Yes/No options must be selected.
#    No option should cancel the action
#    Address should be removed when Yes option is selected
#    As a result of the operation, the address deleted warning should appear.















