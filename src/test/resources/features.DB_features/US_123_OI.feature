# As a user, when i should sign up then Should be able to see new user information in the correct user schema and
# columns
#	Correct infos need to be seen in the correct columns.
#	I should see user informations in the correct columns, eg : email.

Feature: US123
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
    When user closes connection to database