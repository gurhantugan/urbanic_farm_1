# As a user, when i should sign up then Should be able to see new user information in the correct user schema and
# columns
#	Correct infos need to be seen in the correct columns.
#	I should see user informations in the correct columns, eg : email.

Feature: US123_124
  #@UI
  @DB
  Scenario: TC001
    Given user is on the Urbanic_Farm page
    When user clicks on Register
    And user fills out the registration form
    And user clicks on Register button
    Then user verifies following column names are present in "user"
      | email      |
      | first_name |
      | id         |
    And user verifies the added user exists
    And user log out
    When user login as new registered user
    And  user clicks on user button
    And user goes to relavent url "https://test.urbanicfarm.com/account/address"
    And user clicks on Add New Address button
    And user enters new zipcode for address and selects the first one
    And user verifies user address in UI and user address in DB is same
    When user closes connection to database