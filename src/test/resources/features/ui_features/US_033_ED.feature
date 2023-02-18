Feature: US033

  Scenario: As a user I should be able to login with valid zipcode

    Given User is on the Urbanic_Farm page
    And  user is on the Registration Page
    And  user enters valid first name in the registration page
    And  user enters valid last name in the registration page
    And  user enters valid email in the registration page
    And  user enters valid password in the registration page
    And  user enters valid confirmation password in the registration page
    And  user enters valid zipcode in the registration page
    Then user clicks on Register button
    Then user verifies its name in registered page


  Scenario: As a user I should not be able to login with invalid zipcode

    Given User is on the Urbanic_Farm page
    And  user is on the Registration Page
    And  user enters valid first name in the registration page
    And  user enters valid last name in the registration page
    And  user enters valid email in the registration page
    And  user enters valid password in the registration page
    And  user enters valid confirmation password in the registration page
    And  user enters invalid zipcode in the registration page and get warning message

      | 1    |
      | 12   |
      | 123  |
      | 1234 |















