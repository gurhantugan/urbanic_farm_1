#Left Column-Address
#Address must be clickable
#Add New Address must be clickable
#Clicking Add New Address, Search Places dropdown menu should appear
#When a place is selected from the dropdown menu, the address information entry screen should appear.
#Search Places dropdown menu must be functional
#Place should be able to be selected from the Search Places dropdown menu
# button should be functional
#When user Click to Cancel button should return to the previous page.

Feature: Various actions in adress

  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Address section
    Given user is on the Urbanic_Farm page
    When user enter the Login button
    And user enter "mesut34@gmail.com" and "Fatrah0305*" as login credentials and clicks login
    Then user logged in and sees "You haven't set your current address yet. Please click here to set your delivery address."
    And the user clicks here to go adress
    And the user is on the Adress page
    When the user clicks on "Add New Adress"
    Then the user sees the search box
   And the user clicks there and writes five digits to search adress
    Then the user should see relevant adresses in dropdown bar
   When the user clicks one of the adress and gets adress details box containing five digits code
   Then the user clicks cancel and returns to adress page



