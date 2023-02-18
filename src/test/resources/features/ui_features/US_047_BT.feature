@US_047
Feature: Account

  Scenario:  As a user, after entering valid information, I should be able to perform various actions in the Account section.	Left Column-Account
    Given user login as Buyer
    * Account must be clickable
    When Account is clicked, Qr code, Full name, Email, Phone should be seen.
    * Copy button should be functional
    * Download button should be functional
    * Edit button should be clickablee
    * Choose file button should be functional and The file should be selected when the choose file button is clicked.
    * The account photo should change after selected file
    * After clicking the Edit button, the phone menu should be updated
    * Save button should be functional
    Then After clicking the Save button, "Your phone number has been updated." should be displayed
    * Toogle the menu botton be functional
    * Clicking the menu button on the Toogle should change the menu dimensions