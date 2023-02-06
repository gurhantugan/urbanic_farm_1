@US_032_SK


Feature: US_032_SK
  Scenario: As a user, I should be able to check valid and invalid passwords.
    Given user is on the Registration Page
    When user enter the left blank in password
          | seko| red|
          |W seko1425|red|

    And user create "password" without at least one number or uppercase or lower case letter or at least 8 and more characters
         |wwwwwww1|red|
          |wwwwwwwW|red|
          |WWWWWWW1|red|

    And user enter unmatched paswords
    |Seko2023|Seko2024|red|
    Then user should not able to register


