@abd_36
Feature:US_036

  Background: As a user I shouldn't be able to login with invalid login
    Given user goes to url
    When user clicks login button

  Scenario:
    Then User verifies that the mail text box is clickable

  Scenario:
    Then Verifies that the user password text box is clickable

  Scenario Outline:
    Given User enters values "<invalidMail>" in the email text box and "<invalidPassword>" in the password text box
    Then  User verifies unable to login with "invalid values"
    Examples:
      | invalidMail  | invalidPassword |
      | a.gmail      | xs              |
      |              | *               |
      |              |                 |
      | eee@gmail.c  |                 |
      | eee@gmailcom | EE              |
      | eee@.com     | Ae              |
      | eeegmail.com | ;?)             |






