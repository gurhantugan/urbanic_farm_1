@US_032_SK


Feature: US_032_SK
  Scenario: As a user, I should be able to check valid and invalid passwords.
    Given user is on the Registration Page

    When user enter the left blank in password
      | seko|
      |W seko1425|

    And user create password without at least one number or uppercase or lower case letter or at least eight and more characters
      |wwwwwww1|
      |wwwwwwwW|
      |WWWWWWW1|

    And user enter unmatched passwords
      |Seko2023|
      |Seko2024|
    Then user should not able to register


